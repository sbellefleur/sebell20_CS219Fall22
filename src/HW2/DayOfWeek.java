// Sarah Bellefleur
// CS219
// Homework 2

package HW2;

//We need to import scanner to be used later
import java.util.Scanner;

public class DayOfWeek {

    public static int dayofweek(int m, int d, int y){
        //use the given parameters
        int Y = y - (14-m) / 12;
        int x = Y + Y/4 - Y/100 + Y/400;
        int M = m + 12 * ((14-m)/12) - 2;
        int D = (d + x + (31 * M) / 12) %7;
        //return the desired result
        return D;
    }

    public static void main(String [] args){
        Scanner kbd = new Scanner(System.in);//A Scanner is used to be able to input data for
        // our function to process

        // get input from the user to pass into our function
        System.out.print("Enter the month by its number: ");
        int m = kbd.nextInt();

        System.out.print("Enter the day of the month by its number: ");
        int d = kbd.nextInt();

        System.out.print("Enter the four digit year: ");
        int y = kbd.nextInt();

        System.out.println(dayofweek(m, d, y));
    }
}
