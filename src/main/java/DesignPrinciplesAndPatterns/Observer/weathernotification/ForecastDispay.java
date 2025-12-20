package DesignPrinciplesAndPatterns.Observer.weathernotification;

public class ForecastDispay implements Display, Observer {
    private float humidity;
    private float pressure;
    private float temperature;

    @Override
    public void display() {
        System.out.println("Forecast display: As per data, we might get rain today");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
