package headfirstdesgin.chapter2;


import java.util.ArrayList;

/**
 * @author: Santosh RNB
 * @created: 5/18/24
 */
public class WeatherData {
    ArrayList<Observer> observers;
    float temperature = 0;
    float pressure = 0;
    float humidity = 0;

    WeatherData() {
        observers = new ArrayList<>();
    }

    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        observers.forEach(x -> x.update(temperature, pressure, humidity));
    }

    public void setData(float temperature, float humidity, float pressure) {
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
