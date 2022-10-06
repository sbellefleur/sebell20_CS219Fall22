package Chapter6Exercises;

public class Exercise6_4 {

    public static String toLower(String s){

        String r = "";
        for (int i = 0; i < s.length(); i ++){
            char ch = s.charAt(i);
            if (ch <= 'Z'&& ch >= 'A'){
                r = r + (char) ('a' + (ch - 'A'));
            }
            else{
                r = r + ch;
            }
        }
        return r;
    }

    public static boolean isAbcedarian(String s){
        s = s.toLowerCase();
        s = toLower(s);
        s = Exercise6_4.toLower(s);

        //rewrite using a while loop
        for (int i = 0; i  < s.length() -1; i++){
            if(s.charAt(i)>s.charAt(i+1)){
                return false;
            }

        }
        //what is true if we've made it to this point in the code?
        return true;
    }
    public static boolean isAlphabetical(String a){
        int i = 0;
        while (i < a.length()-1){
            if(a.charAt(i)>a.charAt(i+1)){
                return false;
            }
            i += 1;

        }
        //what is true if we've made it to this point in the code?
        return true;
    }
    public static void main(String [] args){
        System.out.println(isAbcedarian("biopsy"));
        System.out.println(!isAbcedarian("apple"));
        System.out.println(isAlphabetical("biopsy"));
        System.out.println(!isAlphabetical("apple"));
        System.out.println(toLower("APPLE"));
        System.out.println(toLower("ApPlE"));
        System.out.println(toLower("Apple!@#$%"));
    }
}
