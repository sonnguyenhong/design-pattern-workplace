package weather_o_rama;

public class CurrentConditions implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    private Subject subject;
    public CurrentConditions(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current condition is: ");
        System.out.println("\tTemperature: " + this.temperature + " C degrees");
        System.out.println("\tHumidity: " + this.humidity + "%");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
