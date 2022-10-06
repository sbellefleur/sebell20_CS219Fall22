package HW5;

public class Homework_5 {

    public static boolean canspell(String words, String tiles){

        for (int i = 0 ;i < words.length(); i++){
            int j = 0;

            j = tiles.indexOf(words.charAt(i));
            if (j == -1){
                return false;
            }
            else {
                tiles = tiles.substring(0, j) + tiles.substring(j + 1);
            }

        }
       return true;
    }

    public static void main(String [] args){
        System.out.println(canspell("boot", "axobasrto"));
        System.out.println(!canspell("andrew", "hasbulladphew"));
    }
}
