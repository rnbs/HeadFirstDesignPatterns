package headfirstdesgin.chapter2;

/**
 * @author: Santosh RNB
 * @created: 5/18/24
 */
public class main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);
        weatherData.notifyObservers();
        weatherData.setData(10, 10, 100);
        weatherData.notifyObservers();
    }
}
