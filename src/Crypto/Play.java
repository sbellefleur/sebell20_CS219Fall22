package Crypto;

public class Play {

    public static void main(String [] args){
        System.out.println(3/2);//1
        System.out.println(-3/2);//-1
        System.out.println(Math.floor(-1.25));//-2.0
        System.out.println(Math.floor(-33.1));//-34.0
        System.out.println(-5/2);//-2
        System.out.println(Math.floor(-5/2));//-2 -->Java does the division and then passes the result to the function
        System.out.println(Math.floor(-5/2.0));//-3-->not integer division
        System.out.println(Math.floorDiv(-3,2));//

        //remainder play
        System.out.println(-15%12);
        System.out.println(-93 % 13);
        System.out.println(Math.floorMod(-15,12));
    }
}
