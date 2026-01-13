package DesignPrinciplesAndPatterns.Observer.weather_observer_testcase.services;

import DesignPrinciplesAndPatterns.Observer.weather_observer_testcase.Observer;
import DesignPrinciplesAndPatterns.Observer.weather_observer_testcase.utils.NotificationUtils;

public class HumidityService implements Observer {
    @Override
    public void notifyObserver(double value) {
        NotificationUtils.sendNotification("New value is " + value);
    }
}