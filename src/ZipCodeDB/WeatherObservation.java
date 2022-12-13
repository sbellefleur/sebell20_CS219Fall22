package ZipCodeDB;

public class WeatherObservation {

    private double humidity;
    private double windSpeed;
    private double temperature;
    private String clouds;

    public WeatherObservation(double humidity, double windSpeed, double temperature, String clouds) {
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.temperature = temperature;
        this.clouds = clouds;
    }

    @Override
    public String toString() {
        return "WeatherObservation{" +
                "humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                ", temperature=" + temperature +
                ", clouds='" + clouds + '\'' +
                '}';
    }
}
