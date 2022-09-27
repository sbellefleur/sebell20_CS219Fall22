package Exams;

import java.util.Scanner;

public class Exam1 {

    public static int btwTwoAndSeven(double n) {
        int count = 0;
        while (n != 0) {
            double g = n % 10;
            if (g > 2 && g < 7) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    public static double getN(Scanner n) {
        boolean valid = false;
        double N = 0;
        while (!valid) {
            System.out.print("Enter an integer: ");
            if (n.hasNextDouble()) {
                N = n.nextDouble();
                if (N % 1 != 0) {
                    System.out.printf("Error: the number cannot be a decimal. You entered %.2f", N, ". Please" +
                            "enter a whole number.");
                    System.out.println();
                } else if (N < 0) {
                    System.out.printf("Error: the number cannot be negative. You entered %.2f", N, ". Please" +
                            "enter a positive number.");
                    System.out.println();
                } else {
                    valid = true;
                }
                //break;
            } else {
                System.out.printf("Error: Please enter a whole number. You entered \"%s\"",
                        n.next(), "\n");
            }
        }
        return N;
    }

    public static void main(String [] args){

        Scanner n = new Scanner(System.in);

        double N = getN(n);

        System.out.println(btwTwoAndSeven(N));

    }

}
