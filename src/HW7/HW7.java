/*
Sarah Bellefleur
CS 219
Homework 7
10/27/22
 */
package HW7;

import java.util.Arrays;

public class HW7 {

    /*
        Return true if two values next to each other in the array are the same.
        See the tests in main.  The array should not be modified or reordered.
     */
    public static boolean hasAdjacent(String[] aos) {
        for (int i = 0; i < aos.length - 1; i++) {
            if (aos[i] .equals(aos[i+1]))
                return true;
            }
        return false;
    }
        /*
            Return true if the array has a duplicate. Make sure the array
            is not modified or reordered. That is, don't sort it and check
            for adjacent values that are the same.
            Hint 1: need to look at all possible pairs of array entries.
         */
        public static boolean hasDuplicate (String[]aos){
            for (int i = 0; i < aos.length; i++) {
                for (int j =0; j < aos.length; j++){
                    if (aos[i] .equals(aos[j]) && i!=j){
                        return true;
                    }
                }
            }
            return false; // shut up error message
        }
        /*
            Return true if two values at different locations in the array add up
            to the target.  Same hint as hasDuplicate.  See the tests in main.
         */
        public static boolean goofy ( int[] nums, int target){
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = 1; j < nums.length; j++) {
                    if (nums[i] + nums[j]== target&&i!=j)
                        return true;
                }
            }
            return false;
        }
        /*
            Turn string s into an array of characters and return the array.
         */
        public static char[] make_array (String s){
            char[] aoc = new char[s.length()];
            for (int i  = 0; i< s.length(); i++){
                aoc[i]=(s.charAt(i));
            }
            return aoc;
        }
        /*
            Return true if s1 is an anagram of s2. That is they contain the same letters.
            For example "angered" and "enraged" are anagrams.
            Hint: Use make_array, Arrays.sort, and Arrays.equals directly.
         */
        public static boolean isAnagram (String s1, String s2){
            char [] arr1 = make_array(s1);
            char [] arr2 = make_array(s2);
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (arr1.length != arr2.length) {
                return false;
            } else {
                int j = 0;
                int i = 0;
                while (i < arr1.length) {
                    if (arr1[i] == arr2[i]) {
                        j++;
                        i++;
                    }
                    else return false;
                }
                return j == arr1.length;
            }
        }
        /*
          Write a method  numDifferent that takes a sorted array of integers as a parameter and
          returns the number of different values in the array. You can assume the array is in
          sorted order. This means that duplicates will be next to each other. For example, if a
          variable nums stores the following values:
             int [] nums = {3, 5, 5, 5, 8, 21, 21, 23, 34, 39, 39, 40, 40, 40, 41};
          then the call of numDifferent(nums) should return 9 because this list has 9 unique
          values (3, 5, 8, 22, 23, 34, 39, 40 and 41). It is possible that the list might
          not have any duplicates. For example if list instead stored this sequence of values:
            int [] nums = {1, 2, 11, 17, 19, 20, 23, 24, 25, 26, 31, 34, 37, 40, 41};
           numDifferent(nums) would return 15 because this list contains 15 different values.
         */
        public static int numDifferent ( int[] nums){
            int count = 1;// start count at one to account for the first number in the array that is not compared
            for (int i = 0; i < nums.length -1; i++){
                    if (nums[i]!=(nums[i+1])) {
                        count += 1;
                    }
            }
            return count; // shut up error message
        }
        public static void main (String[]args){
            String[] names = {"Harry", "Ron", "Draco", "Draco", "Hermione"};
            String[] fruit = {"apple", "pear", "banana", "apple", "orange", "guava"};
            System.out.println(hasAdjacent(names));
            System.out.println(!hasAdjacent(fruit));

            System.out.println(hasDuplicate(names));
            System.out.println(hasDuplicate(fruit));
            System.out.println(!hasDuplicate(new String[]{"baseball", "hockey", "soccer", "football"}));

            int[] values = {2, 7, 11, 15};
            System.out.println(goofy(values, 9));
            System.out.println(!goofy(values, 5));

            System.out.println(Arrays.equals(make_array("hello"),
                    new char[]{'h', 'e', 'l', 'l', 'o'}));

            System.out.println(isAnagram("angered", "enraged"));
            System.out.println(!isAnagram("pizza", "sauce"));

            int[] nums = {3, 5, 5, 5, 8, 21, 21, 23, 34, 39, 39, 40, 40, 40, 41};
            System.out.println(numDifferent(nums) == 9);
            //System.out.println(numDifferent(nums));

            int[] nums2 = {1, 2, 11, 17, 19, 20, 23, 24, 25, 26, 31, 34, 37, 40, 41};
            System.out.println(numDifferent(nums2) == 15);
            //System.out.println(numDifferent(nums2));
        }
    }

