package HW1;

public class Time {
    public static void main(String [] args){
        //Sarah Bellefleur
        //CS 219
        //Homework 1
        int hour = 11;
        int minute = 30;
        int second = 15;
        double sec_since_mid = hour*60*60+minute*60+second;
        double sec_in_day = 24*60*60;
        double sec_left_today = sec_in_day - sec_since_mid;
        double percent_of_day = (sec_since_mid / sec_in_day) * 100;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.print(second);
        System.out.println(".");
        System.out.print("It has been ");
        System.out.print(sec_since_mid);
        System.out.println(" seconds since midnight.");
        System.out.print("There are ");
        System.out.print(sec_left_today);
        System.out.println(" seconds left in the day.");
        System.out.print(Math.round(percent_of_day));
        System.out.println("% of the day has passed");

    }
}
