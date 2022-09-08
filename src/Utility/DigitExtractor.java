package Utility;

public class DigitExtractor {

    public static int last(int n){
        // n = Math.abs(n);

        if (n < 0){
            n = -n;
        }
        return n % 10;

    }

    public static int SecondToLast(int m){
        m = Math.abs(m);
        return (m/10) % 10;
        //return ((m - DigitExtractor.last(m)) % 100)/10;

    }

    public static void main(String [] args){
        System.out.println(last(2753)==3);
        System.out.println(last(-749)==9);

        System.out.println(SecondToLast(1234));

        System.out.print(23%-5);

    }
}
