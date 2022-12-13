package ZipCodeDB;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
//import java.util.Collections;
import java.util.Scanner;

/*
* Hold data about one zipcode
 */
public class ZipCode implements Comparable<ZipCode>, Distance, WeatherInfo{

    //to decide if it will be public decide if you want code outside the class to be able to change the info
    private String code;
    private String state; //two character code abreviation
    private String city;
    private double lng;
    private double lat;
    private int pop; //shouldn't exceed 2^31



    public ZipCode(String code, String state, String city, double lng, double lat, int pop) {
        this.code = code;
        this.state = state;
        this.city = city;
        this.lng = lng;
        this.lat = lat;
        this.pop = pop;
    }

    @Override
    public String toString() {
        return "ZipCode{" +
                "code='" + code + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                ", pop=" + pop +
                '}';
    }

    public String getCode() {//just returns the code to make it accessible outside the function
        return code;
    }
    // The natural ordering for a zipcode
    ///just returns the code to make it accessible outside the function
    public double getLat() {return lat;}

    @Override
    public int compareTo(ZipCode zc) {
        return this.code.compareTo(zc.code);
    }

    @Override
    public double distance(ZipCode zip) {
        return 0; //fancy great circle distance
    }
    public WeatherObservation getWeatherData(){
            URL url = null; // null is the nothing value
            Scanner s = null;
            // can only add the negative into the lng because these are only US zipcodes
            String path = "http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat="
                    +this.lat+"&lng=-"+this.lng+"&username=edharcourt";
            try {
                url = new URL(path); // create a URL object for the path
                s = new Scanner(url.openConnection().getInputStream());
            } catch (
                    MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            //read zipcode file line by line

            double humidity = 0, temp = 0 , speed = 0;
            String clouds = null;


            while (s.hasNextLine()){
                String line = s.nextLine();
                // check for humidity
                if(line.indexOf("humidity")>0){
                    humidity = Double.parseDouble(line.substring(line.indexOf(":")+1, line.indexOf(",")));
                }
                else if (line.indexOf("temperature")>0){
                    temp = Double.parseDouble(line.substring(line.indexOf(":")+3, line.indexOf(",")-1));
                }
                else if (line.indexOf("windSpeed")>0){
                    speed = Double.parseDouble((line.substring(line.indexOf(":")+3, line.indexOf(",")-1)));
                }
                else if (line.indexOf("clouds")>0){
                    clouds = line.substring(line.indexOf(":")+3, line.indexOf(",")-1);
                }
            }

            WeatherObservation ob = new WeatherObservation(humidity, speed, temp, clouds);

           return ob;
    }

    // http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=44&lng=-74&username=edharcourt
}
