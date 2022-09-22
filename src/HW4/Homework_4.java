package HW4;

import java.util.Scanner;

import Utility.Investment;

public class Homework_4 {


    public class Investment {


        public static double investment(double c, double r, double t, double n) {
            return c * Math.pow(1 + r / n, t * n);
            //c:initial investment
            //r: interest rate
            //t: number of years the money will be invested
            //n: number of times to compound the interest

        }
        public static double getInitialInvestment(Scanner c){
            boolean valid = false;
            double InitialInvestment = 0;
            while (!valid){
                System.out.print("Enter an initial investment: ");
                //double velocity = kbd.nextDouble();
                if (c.hasNextDouble()) {
                    InitialInvestment = c.nextDouble();
                    if (InitialInvestment  < 0 ){
                        System.out.printf("Error: initial investment cannot be negative. You entered %.2f", InitialInvestment);
                        System.out.println();
                    }
                    else{
                        valid = true;}
                    //break;
                } else {
                    System.out.printf("Error: Please enter a decimal number. You entered \"%s\"",
                            c.next(),"\n");
                }
            }
            return InitialInvestment;
        }
        public static double getInterestRate(Scanner r){
            boolean valid = false;
            double InterestRate = 0;
            while (!valid){
                System.out.print("Enter the interest rate as a decimal: ");
                //double velocity = kbd.nextDouble();
                if (r.hasNextDouble()) {
                    InterestRate = r.nextDouble();
                    if (InterestRate > 1 ){
                        System.out.printf("Error: the interest rate cannot be more than " +
                                "100 percent. You entered %.2f", InterestRate, ". Please enter the percentage as a decimal.");
                        System.out.println();
                    }
                    else{
                        valid = true;}
                    //break;
                } else {
                    System.out.printf("Error: Please enter a decimal number. You entered \"%s\"",
                            r.next(),"\n");
                }
            }
            return InterestRate;
        }
        public static double getYears(Scanner t) {
            boolean valid = false;
            double Years = 0;
            while (!valid) {
                System.out.print("Enter a number of years for your money to be invested: ");
                if (t.hasNextDouble()) {
                    Years = t.nextDouble();
                    if (Years < 0) {
                        System.out.printf("Error: number of years cannot be negative. You entered %.2f", Years, ". Please" +
                                "enter a positive number of years.");
                        System.out.println();
                    } else if (Years % 1 != 0) {
                        System.out.printf("Error: number of years cannot be a decimal. You entered %.2f", Years, ". Please" +
                                "enter a whole number of years.");
                    } else {
                        valid = true;
                    }
                    //break;
                } else {
                    System.out.printf("Error: Please enter a whole number. You entered \"%s\"",
                            t.next(), "\n");
                }
            }
            return Years;
        }
        public static double getTimestoCompound(Scanner n){
            boolean valid = false;
            double TimestoCompound = 0;
            while (!valid){
                System.out.print("Enter a number of times to compound your investment: ");
                if (n.hasNextDouble()) {
                    TimestoCompound = n.nextDouble();
                    if (TimestoCompound  < 0 ){
                        System.out.printf("Error: number of times to compound cannot be negative. You entered %.2f", TimestoCompound,". Please" +
                                "enter a positive number of years.");
                        System.out.println();
                    }
                    else if (TimestoCompound % 1 != 0){
                        System.out.printf("Error: number of times to compound cannot be a decimal. You entered %.2f",   TimestoCompound, ". Please" +
                                "enter a whole number of times.");
                    }
                    else{
                        valid = true;}
                    //break;
                } else {
                    System.out.printf("Error: Please enter a whole number. You entered \"%s\"",
                            n.next(),"\n");
                }
            }
            return TimestoCompound;
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
        }*///c:initial investment
            //r: interest rate
            //t: number of years the money will be invested
            //n: number of times to compound the interest
                    double investment = getInitialInvestment(kbd);
                    double interestRate = getInterestRate(kbd);
                    double Years = getYears(kbd);
                    double timestoCompound = getTimestoCompound(kbd);

                    // What is true at this point?, x == 1
                    System.out.print("When the investment is " + investment);
                    System.out.print(" ,the interest rate is " + interestRate);
                    System.out.print(" ,the years are" + Years);
                    System.out.print(" ,and the number of times to compound is  " + timestoCompound);
                    System.out.printf(" the windchill will be %.2f\n",investment(investment, interestRate, Years, timestoCompound));


                }
            }
