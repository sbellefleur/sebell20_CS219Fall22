import Utility.Investment;

import java.util.Scanner;

public class InvestmentCalculator {

    public static void main(String [] args){

        // read c, r, t, and n from the user

        Scanner kbd = new Scanner(System.in);

        System.out.print("How much is the initial investment?: " );
        int i = kbd.nextInt();

        System.out.print("What is the interest rate: ");
        double r = kbd.nextDouble();

        System.out.print("How many years will the money be invested?: ");
        int t = kbd.nextInt();

        System.out.print("How many times will the interest be compounded?: ");
        int n = kbd.nextInt();


        System.out.printf("Your investment is worth %.2f", Investment.investment(i, r, t, n),"💰");

    }
}
