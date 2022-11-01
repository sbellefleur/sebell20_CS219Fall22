package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class Exam2 {
    public static String[] load_words(String path, int n) {

        URL url = null; // null is the nothing value
        Scanner s = null;
        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (
                MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (
                IOException e) {
            throw new RuntimeException(e);
            }
        // create an array of strings
        String[] words = new String[n];

        int i = 0;
        while (s.hasNextLine()) {
            words[i++] = s.nextLine();
        }

        String [] palindromes = new String [n];
        n=0;
        while (s.hasNextLine()){
            if (isPalindrome2(words[i])==true){
                palindromes[n] = words [i];
                n++;
                i++;
            }
            else
                i++;
        }
        for (int i =0; i< palindromes.length; i++)
            for(int j = 0; j < palindromes.length -1; j++)
                if (palindromes[i] < palindromes[j]){
                    String temp = palindromes [i];
                    palindromes [i] = palindromes [j]


                }
        return palindromes;
    }

    public static boolean isPalindrome2(String s) {
        if (s.length()<2)
            return true;
        else return (s.charAt(0) == s.charAt(s.length() - 1)) &&
                isPalindrome2(s.substring(1, s.length() - 1));
    }
    /*public static String [] sort(String [] aos){
        for(int i = 0; i < aos.length; i++){
            int j = smallest_loc(i, aoi);
            int temp = aos[i];
            aos[i] = aos[j];
            aos[j] = temp;
        }
        return aos;
    }

     */

    public static void main(String[] args) {
        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt", 2800);
        System.out.println(words);

    }
}
