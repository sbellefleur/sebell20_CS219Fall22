import java.util.Random;

public class LogicalOperators {

    public static void main(String[] args) {

        Random r = new Random();

        int coinflip = r.nextInt(2);

        if (coinflip == 0) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }

        int die1 = r.nextInt(6)+1;
        int die2 = r.nextInt(6)+1;

        if (die1 == 1 && die2 == 1){
            System.out.println("Snake eyes");
        }
        else{
            System.out.println("No snake eyes");
        }

        //Check if die 1 is between 2 and 5 inclusive
        if(die1 >= 2 && die1 <= 5){
            System.out.println("Between 2 and 5 inclusive");
        }
        if (die1 + die2 == 2){
            System.out.println("Snake eyes");
        }
        if (die1 == 1){
            if (die2 ==1){
                System.out.println("Snake eyes");
            }
        }
        if (die1 != 1 || die2 != 1){
            System.out.println("At least one die was not a one");
        }
        if (die1 != 1){
            System.out.println("Die1 was not a 1");}
            else if( die2 != 1){
                System.out.println("Die2 was not a one");
            }
        //check to see if we have exactly one 1

        if (die1 ==1 && die2 != 1){
            System.out.println("We have one 1");}

            else if (die1 != 1 && die2 == 1){
                System.out.println("We have one 1");

            }
        }
    }



