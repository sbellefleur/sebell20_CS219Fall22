package Utility;

import java.util.Scanner;

public class Weather {

    public static double windchill(double t, //temperature degrees farenheight
                                    double v){ //velocity in mph
        return 35.74 + 0.6215 * t + (0.4275*t-35.75) * Math.pow(v, 0.16);

    }
    public static double getVelocity(Scanner s){
        boolean valid = false;
        double velocity = 0;
        while (!valid){
            System.out.print("Enter a wind velocity in MPH: ");
            //double velocity = kbd.nextDouble();
            if (s.hasNextDouble()) {
                velocity = s.nextDouble();
                if (velocity < 0 ){
                    System.out.printf("Error: velocity cannot be negative. You entered %.2f", velocity);
                }
                else{
                    valid = true;}
                //break;
            } else {
                System.out.printf("Error: Please enter a decimal number. You entered \"%s\"",
                        s.next(),"\n");
            }
        }
        return velocity;
    }
    public static double getTemperature(Scanner s){
        double temperature = 0;
        while (true){
            System.out.print("Enter a wind Temperature in degrees farenheight: ");
            //double velocity = kbd.nextDouble();
            if (s.hasNextDouble()) {
                temperature = s.nextDouble();
                break;
            } else {
                System.out.printf("Error: Please enter a decimal number. You entered \"%s\"",
                        s.next(),"\n");
            }
        }
        return temperature;
    }


    public static void main(String [] args){

        // Used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        /*System.out.print("Enter temperature in degrees F: ");
        //double temperature = kbd.nextDouble();
        double temperature;
        if (kbd.hasNextDouble()){
            temperature = kbd.nextDouble();
        }
        else{
            System.out.printf("Error: Please enter a decimal number. You entered \"%s\"",
                    kbd.next());
            return; //exit main
        }*/
        double velocity = getVelocity(kbd);
        double temperature = getTemperature(kbd);

        // What is true at this point?, x == 1
        System.out.print("When the temperature is " + temperature);
        System.out.print(" and the velocity is " + velocity);
        System.out.printf(" the windchill will be %.2f\n",windchill(temperature, velocity));

        System.out.printf("The windchill for %.1f degrees at %.1f MPH is %.2f\n",
                temperature, velocity, windchill(temperature, velocity));

        System.out.println("They said \"Don't do it\"");

        //System.out.println("The windchill for " + (t) + "degrees at " + (v) + "is " windchill)


    }
}
