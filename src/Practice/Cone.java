package Practice;

import java.util.Scanner;

public class Cone {

    public static double volume(int r, int h){
       return (.333)*(Math.PI)*(r*r)*(h);
    }
    public static int getRadius(Scanner c) {
        boolean valid = false;
        int Radius = 0;
        while (!valid) {
            System.out.print("Enter the radius of the cone: ");
            if (c.hasNextDouble()) {
                Radius = c.nextInt();
                if (Radius < 0) {
                    System.out.printf("Error: Radius cannot be negative. You entered"+ Radius);
                    System.out.println();
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: Please enter an integer. You entered \"%s\"",
                        c.next(), "\n");
            }
        }
        return Radius;
    }

    public static int getHeight(Scanner r) {
        boolean valid = false;
        int Height = 0;
        while (!valid) {
            System.out.print("Enter the height as an integer: ");
            if (r.hasNextInt()) {
                Height = r.nextInt();
                if (Height < 1) {
                    System.out.println("Error: the height cannot be less than " +
                            "1. You entered"+Height);
                    System.out.println();
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: Please enter a whole number. You entered \"%s\"",
                        r.next(), "\n");
            }
        }
        return Height;
    }
    public static void main(String [] args){
        Scanner q = new Scanner(System.in);

        int Radius = getRadius(q);
        int Height = getHeight(q);

        System.out.printf("The volume will be %.2f\n", volume(Radius, Height));
    }

}
