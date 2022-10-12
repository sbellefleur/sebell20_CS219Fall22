package HW6;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class swallow_stats {

    public static void swallow_stats(){
        //connect to the webpage of speeds
    URL url = null; // null is the nothing value
    Scanner s = null;
    String path = "http://10.60.15.25/~ehar/cs219/swallow-speeds.txt";
        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       // if you get here, you were able to connect to the website
        //read each line of the web file
        double max = 0.0;
        double min = 1000000.0;
        double sum = 0.0;
        int count = 0;
        //boolean n = true;
        while (s.hasNextLine()){
            String line = s.nextLine(); // read a line of the website
            if(line.indexOf("#")==-1&&line.length()!=0){// modify condition - length of line
                if (Double.parseDouble(line)<min){
                    min = Double.parseDouble(line);
                }
                else if (Double.parseDouble(line)>max){
                    max = Double.parseDouble(line);
                }
                sum = sum + Double.parseDouble(line);
                count++;

            }

        }
        System.out.printf("The maximum speed of a swallow is %.2f\n", max," meters per second.");
        System.out.printf("The minimum speed of a swallow is %.2f\n", min," meters per second.");
        System.out.printf("The average speed of a swallow is %.2f\n", sum/count, "meters per second.");
        }


   public static void main(String [] args){
       swallow_stats();
    }
}
