package DesignPrinciplesAndPatterns.SingletonPattern.assignment.connection_pool.v1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConnectionPoolImpl implements ConnectionPool {
    // ------------------------------------------------------------
    //                     SINGLETON INSTANCE
    // ------------------------------------------------------------

    // Holds the ONE AND ONLY instance of the connection pool
    private static ConnectionPool instance = null;

    // Maximum number of connections allowed in the pool
    private final int maxConnections;

    // Thread-safe queue storing available database connections
    private final BlockingQueue<DatabaseConnection> connectionQueue;

    // ------------------------------------------------------------
    //                   PRIVATE CONSTRUCTOR
    // ------------------------------------------------------------

    // Constructor is private so nobody can create objects with 'new'
    private ConnectionPoolImpl(int maxConnections) {
        this.maxConnections = maxConnections;

        // Create a thread-safe queue with a fixed capacity
        this.connectionQueue = new ArrayBlockingQueue<>(maxConnections);

        // Initialize the pool with dummy connections
        initializePool();
    }

    // ------------------------------------------------------------
    //                   SINGLETON getInstance()
    // ------------------------------------------------------------

    // Returns the singleton instance. Creates it if it doesn't exist.
    public static ConnectionPool getInstance(int maxConnections) {

        // If no instance exists, create a new one
        if (instance == null) {
            instance = new ConnectionPoolImpl(maxConnections);
        }

        // Return the only instance
        return instance;
    }

    // Reset the singleton instance (used for testing)
    public static void resetInstance() {
        instance = null;
    }

    // ------------------------------------------------------------
    //                   POOL INITIALIZATION
    // ------------------------------------------------------------

    @Override
    public void initializePool() {
        // Create 'maxConnections' number of DatabaseConnection objects
        for (int i = 0; i < maxConnections; i++) {

            // Create a new connection
            DatabaseConnection connection = createConnection();

            // Add connection to the queue of available connections
            connectionQueue.offer(connection);
        }
    }

    // Helper method to create a dummy connection
    private DatabaseConnection createConnection() {
        return new DatabaseConnection();
    }

    // ------------------------------------------------------------
    //             GET A CONNECTION FROM THE POOL
    // ------------------------------------------------------------

    @Override
    public DatabaseConnection getConnection() {
        try {
            // take() removes and returns the next available connection.
            // If the pool is empty, take() waits until one is released.
            return connectionQueue.take();

        } catch (InterruptedException e) {
            // Restore interruption flag
            Thread.currentThread().interrupt();

            // Wrap and rethrow as a runtime exception
            throw new RuntimeException("Error getting connection", e);
        }
    }

    // ------------------------------------------------------------
    //           RELEASE A CONNECTION BACK TO THE POOL
    // ------------------------------------------------------------

    @Override
    public void releaseConnection(DatabaseConnection connection) {
        try {
            // Only attempt to return if connection is not null
            if (connection != null) {
                connectionQueue.offer(connection);   // add connection back to the queue
            }

        } catch (Exception e) {
            // Wrap and throw exception if error occurs
            throw new RuntimeException("Error releasing connection", e);
        }
    }

    // ------------------------------------------------------------
    //            GET NUMBER OF AVAILABLE CONNECTIONS
    // ------------------------------------------------------------

    @Override
    public int getAvailableConnectionsCount() {
        // The queue size = number of unused connections
        return connectionQueue.size();
    }

    // ------------------------------------------------------------
    //                GET TOTAL NUMBER OF CONNECTIONS
    // ------------------------------------------------------------

    @Override
    public int getTotalConnectionsCount() {
        // Total connections is always equal to the maxConnections
        return maxConnections;
    }

}
