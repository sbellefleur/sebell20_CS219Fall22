package Utility;

public class Investment {

    public static double investment(double c, double r, int t, int n){
        return c*Math.pow(1+r/n, t*n);

    }

    public static void main(String [] args){

        //double c = 1.0; // initial deposit
        //double r = 1.0; // 100% interest
        //int t = 1; // number of years
        //double n = 1e9; // compound a billion times
        //int n = (int) 2e9; // caste int to double
        //double p = c*Math.pow(1+r/n, t*n);

        System.out.println(investment(1.0, 1.0, 1, (int)1e9));
        System.out.println(investment(1000, .03, 10, 365));

    }
}
