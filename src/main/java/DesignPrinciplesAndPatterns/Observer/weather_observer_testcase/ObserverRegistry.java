package DesignPrinciplesAndPatterns.Observer.weather_observer_testcase;

public interface ObserverRegistry {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(double value);
}