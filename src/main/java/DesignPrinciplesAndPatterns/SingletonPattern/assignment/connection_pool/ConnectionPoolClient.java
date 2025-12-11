package DesignPrinciplesAndPatterns.SingletonPattern.assignment.connection_pool;

import DesignPrinciplesAndPatterns.SingletonPattern.assignment.connection_pool.v0.ConnectionPool;
import DesignPrinciplesAndPatterns.SingletonPattern.assignment.connection_pool.v0.ConnectionPoolImpl;
import DesignPrinciplesAndPatterns.SingletonPattern.assignment.connection_pool.v0.DatabaseConnection;

public class ConnectionPoolClient {
    public static void main(String[] args) {

        // Create pool with max 3 connections
        ConnectionPool pool = ConnectionPoolImpl.getInstance(3);

        System.out.println("=== Initial State ===");
        System.out.println("Available connections: " + pool.getAvailableConnectionsCount());
        System.out.println("Total connections: " + pool.getTotalConnectionsCount());

        // --------------------------------------------------------------
        // GET CONNECTIONS FROM THE POOL
        // --------------------------------------------------------------
        System.out.println("\nBorrowing 3 connections...");

        DatabaseConnection c1 = pool.getConnection();
        DatabaseConnection c2 = pool.getConnection();
        DatabaseConnection c3 = pool.getConnection();

        System.out.println("Available connections after borrowing: " + pool.getAvailableConnectionsCount());

        // --------------------------------------------------------------
        // TRY TO GET A 4th CONNECTION (will wait until one is released)
        // --------------------------------------------------------------
        System.out.println("\nAttempting to get a 4th connection...");
        new Thread(() -> {
            DatabaseConnection c4 = pool.getConnection();
            System.out.println("Thread: Got a 4th connection!");
        }).start();

        // Sleep so we can observe the thread waiting
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {
        }

        // --------------------------------------------------------------
        // RELEASE ONE CONNECTION
        // --------------------------------------------------------------
        System.out.println("\nReleasing 1 connection from main thread...");
        pool.releaseConnection(c1);

        System.out.println("Available connections now: " + pool.getAvailableConnectionsCount());

        // Sleep so we can observe the thread getting the released connection
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {
        }

        // --------------------------------------------------------------
        // Release remaining connections
        // --------------------------------------------------------------
        System.out.println("\nReleasing remaining connections...");
        pool.releaseConnection(c2);
        pool.releaseConnection(c3);

        System.out.println("Available connections now: " + pool.getAvailableConnectionsCount());

        System.out.println("\n=== Test Complete ===");
    }

}
