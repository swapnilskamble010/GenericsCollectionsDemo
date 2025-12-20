package DesignPrinciplesAndPatterns.Observer.weathernotification;

public class CurrentStatsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("Current data: " + temperature + ", " + humidity + ", " + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
