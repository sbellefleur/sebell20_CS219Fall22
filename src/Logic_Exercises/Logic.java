package Logic_Exercises;

public class Logic {

    public static boolean cigarParty(int cigars, boolean isWeekend){
        if (isWeekend){
            if (cigars > 39);
            return true;}

        else {
            if(cigars > 39 && cigars < 61){
                return true;
            }
            else { return false;}
        }
    }
    public static boolean ordered(int d1, int d2, int d3){
        return d1 < d2 && d2< d3 || d3 < d2 && d2 < d1;
    }
    public static int caughtSpeeding(int speed, Boolean isBirthday){
        if (isBirthday){
            if (speed < 66 ){
            return 0;}
            else if (speed <86 ){
                return 1;
            }
            else{
                return 2;
            }
        }
        else{
            if (speed < 61 ){
                return 0;}
            else if (speed <81 ){
                return 1;
            }
            else{
                return 2;
            }
        }


    }
    public static void main(String [] args){
        System.out.println(caughtSpeeding(60,false)==0);
        System.out.println(caughtSpeeding(65,false)==1);
        System.out.println(caughtSpeeding(65,true)==0);
        System.out.println(caughtSpeeding(81,false)==2);
        System.out.println(caughtSpeeding(81,true)==1);
        System.out.println(cigarParty(30,false)==false);
        System.out.println(cigarParty(50,false)==true);
        System.out.println(cigarParty(70,true)==true);
        System.out.println(ordered(30,24,60)==false);
        System.out.println(ordered(50,40,30)==true);
        System.out.println(ordered(20,45, 96)==true);
    }
}


