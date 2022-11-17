package ZipCodeDB;
/*
* Hold data about one zipcode
 */
public class ZipCode {
    //to decide if it will be public decide if you want code outside of the class to be able to change the info
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
}
