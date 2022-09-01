package Utility;

import java.util.Scanner;

public class Weather {

    public static double windchill(double t, //temperature degrees farenheight
                                    double v){ //velocity in mph
        return 35.74 + 0.6215 * t + (0.4275*t-35.75) * Math.pow(v, 0.16);

    }


    public static void main(String [] args){

        // Used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter temperature in degrees F: ");
        double temperature = kbd.nextDouble();

        System.out.print("Enter a wind velocity in MPH: ");
        double velocity = kbd.nextDouble();

        System.out.print("When the temperature is " + temperature);
        System.out.print(" and the velocity is" + velocity);
        System.out.printf(" the windchill will be %.2f\n",windchill(temperature, velocity));

        System.out.printf("The windchill for %.1f degrees at %.1f MPH is %.2f\n",
                temperature, velocity, windchill(temperature, velocity));

        System.out.println("They said \"Don't do it\"");

        //System.out.println("The windchill for " + (t) + "degrees at " + (v) + "is " windchill)


    }
}
