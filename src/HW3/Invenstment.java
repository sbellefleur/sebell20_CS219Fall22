package HW3;

import Utility.Investment;

import java.util.Scanner;

public class Invenstment {


    public static double investment(double c, double r, double t, double n) {
        return c * Math.pow(1 + r / n, t * n);

    }

    public static void main(String[] args) {
        // read c, r, t, and n from the user

        Scanner kbd = new Scanner(System.in);

        System.out.print("How much is the initial investment?: ");
        if (!kbd.hasNextDouble()){
            System.out.printf("Initial deposit should be greater than zero. You entered \"%s\"",
                kbd.next());
            System.exit(-1);
        }
        double c = kbd.nextDouble();

        if (c < 0) {
            System.out.printf("Initial deposit should be greater than zero. You entered \"%s\"",
                    c);
            System.exit(-1);
        }

        System.out.printf("What is the interest rate? ");
        if (!kbd.hasNextDouble()){
            System.out.printf("Initial deposit should be greater than zero. You entered \"%s\"",
                    kbd.next());
            System.exit(-1);
        }
        double r = kbd.nextDouble();

        if (r < 0 || r > 1){
            System.out.printf("The interest rate should be a decimal representation of a percentage. You entered \"%s\"",
                    r);
            System.exit(-1);
        }
        System.out.printf("For how many years will the money be invested? ");
        if (!kbd.hasNextDouble()){
            System.out.printf("Initial deposit should be greater than zero. You entered \"%s\"",
                    kbd.next());
            System.exit(-1);
        }
        double t = kbd.nextDouble();

        if (t<0 || t%1!=0){
            System.out.printf("The input should be a positive number of whole years. You entered \"%s\"",
                    t);
            System.exit(-1);
        }

        System.out.printf("How many times will the interest be compounded? ");
        if (!kbd.hasNextDouble()){
            System.out.printf("Initial deposit should be greater than zero. You entered \"%s\"",
                    kbd.next());
            System.exit(-1);
        }
        double n = kbd.nextDouble();

        if (n<0 || n%1!=0 ){
            System.out.printf("The input should be a positive whole number of times to compound the " +
                    "interest annually. You entered \"%s\"", n);
            System.exit(-1);
        }
        System.out.printf("Your investment is worth %.2f", investment(c, r, t, n));

    }

}



