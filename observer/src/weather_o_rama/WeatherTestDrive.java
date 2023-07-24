package weather_o_rama;

public class WeatherTestDrive {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currentConditions = new CurrentConditions(weatherData);
        Observer forecastDisplay = new ForecastDisplay(weatherData);
        Observer statisticDisplay = new StatisticDisplay(weatherData);
        weatherData.setTemperature(30);
        weatherData.setHumidity(89);
        weatherData.setPressure(30);
        weatherData.notifyObservers();
    }
}
