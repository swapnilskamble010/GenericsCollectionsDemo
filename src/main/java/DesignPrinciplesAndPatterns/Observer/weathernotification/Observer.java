package DesignPrinciplesAndPatterns.Observer.weathernotification;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
