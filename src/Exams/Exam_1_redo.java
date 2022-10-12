package Exams;

import java.util.Scanner;

public class Exam_1_redo {
        public static int btwTwoAndSeven(int n) {
            int count = 0;
            while (n != 0) {
                int g = n % 10;
                if (g > 2 && g < 7) {
                    count++;
                }
                n = n / 10;
            }
            return count;
        }

        public static int getN(Scanner n){
            boolean valid = false;
            int N = 0;
            while(!valid){
                System.out.print("Enter an integer: ");
                if (n.hasNextInt()){
                    N=n.nextInt();
                    if (N<0){
                        System.out.printf("Error: the number cannot be negative. You entered %.2f", N, ".Please" +
                                "enter a whole number.");
                        System.out.println();
                    }else{
                        valid = true;
                    }
                }else{
                    System.out.printf("Error: Please enter a whole number. You entered \"%s\"" ,n.next(),"\n");
                }
            }
            return N;
        }

        public static void main(String [] args){

            Scanner n = new Scanner(System.in);

            int N = getN(n);

            System.out.println(btwTwoAndSeven(N));


        }

}
