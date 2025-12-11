package DesignPrinciplesAndPatterns.SingletonPattern.assignment.connection_pool.v1;

public interface ConnectionPool {
    void initializePool();

    DatabaseConnection getConnection();

    void releaseConnection(DatabaseConnection connection);

    int getAvailableConnectionsCount();

    int getTotalConnectionsCount();
}
