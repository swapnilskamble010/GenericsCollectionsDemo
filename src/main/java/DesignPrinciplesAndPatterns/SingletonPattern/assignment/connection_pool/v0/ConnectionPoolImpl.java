package DesignPrinciplesAndPatterns.SingletonPattern.assignment.connection_pool.v0;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPoolImpl implements ConnectionPool {
    // ---------------------------------------------
    //        SINGLETON IMPLEMENTATION
    // ---------------------------------------------

    private static volatile ConnectionPoolImpl instance = null;

    private final int maxConnections; // Maximum number of connections allowed
    private final List<DatabaseConnection> availableConnections;
    private final List<DatabaseConnection> usedConnections;

    // Private constructor - Singleton requirement
    private ConnectionPoolImpl(int maxConnections) {
        this.maxConnections = maxConnections;
        this.availableConnections = new ArrayList<>();
        this.usedConnections = new ArrayList<>();
    }

    // Singleton getInstance() with parameter
    public static ConnectionPoolImpl getInstance(int maxConnections) {
        if (instance == null) {
            synchronized (ConnectionPoolImpl.class) {
                if (instance == null) {
                    instance = new ConnectionPoolImpl(maxConnections);
                    instance.initializePool();
                }
            }
        }
        return instance;
    }

    // Reset for testing
    public static void resetInstance() {
        instance = null;
    }

    // ---------------------------------------------
    //        CONNECTION POOL IMPLEMENTATION
    // ---------------------------------------------

    @Override
    public void initializePool() {
        // Create maxConnections number of dummy database connections
        for (int i = 0; i < maxConnections; i++) {
            availableConnections.add(new DatabaseConnection());
        }
    }

    @Override
    public synchronized DatabaseConnection getConnection() {
        if (availableConnections.isEmpty()) {
            System.out.println("No available connections.");
            return null; // Or block/wait if required
        }

        // Get first available connection
        DatabaseConnection conn = availableConnections.remove(0);
        usedConnections.add(conn);
        return conn;
    }

    @Override
    public synchronized void releaseConnection(DatabaseConnection connection) {
        if (connection == null) return;

        // Move connection back to available list
        usedConnections.remove(connection);
        availableConnections.add(connection);
    }

    @Override
    public int getAvailableConnectionsCount() {
        return availableConnections.size();
    }

    @Override
    public int getTotalConnectionsCount() {
        return maxConnections;
    }

}
