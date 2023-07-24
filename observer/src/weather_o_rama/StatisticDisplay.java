package weather_o_rama;

public class StatisticDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;
    public StatisticDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Statistic: ");
        System.out.println("\tTemperature: " + this.temperature + " C degrees");
        System.out.println("\tHumidity: " + this.humidity + "%");
        System.out.println("\tPressure: " + this.pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
