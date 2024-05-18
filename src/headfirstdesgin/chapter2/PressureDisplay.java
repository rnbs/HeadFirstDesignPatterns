package headfirstdesgin.chapter2;

/**
 * @author: Santosh RNB
 * @created: 5/18/24
 */
public class PressureDisplay implements Observer, Display{
    float temperature;
    float humidity;

    PressureDisplay(WeatherData weatherData) {
        weatherData.addObservers(this);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.humidity = humidity;
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
