package DesignPrinciplesAndPatterns.Observer.weathernotification;

public class WeatherStation {
    static void main() {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(3.4F, 8.9F, 923.3F);

        ForecastDispay fd = new ForecastDispay();
        CurrentStatsDisplay cd = new CurrentStatsDisplay();
        AverageStatsDisplay ad = new AverageStatsDisplay();

        weatherData.registerObserver(fd);
        weatherData.registerObserver(cd);
        weatherData.registerObserver(ad);

        weatherData.setMeasurements(31.4F, 81.9F, 923.3F);

        weatherData.removeObserver(fd);

        weatherData.setMeasurements(0.4F, 81.9F, 923.3F);

//        ad.setSubject(weatherData);
        ad.registerWithSubject(weatherData);

        weatherData.setMeasurements(0.5F, 81.9F, 923.3F);


    }
}
