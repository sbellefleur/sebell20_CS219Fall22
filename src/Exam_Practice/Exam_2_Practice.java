package Exam_Practice;

public class Exam_2_Practice {

    public static boolean areFactors(int [] aoi, int n){
        for (int i = 0; i < aoi.length; i++)
            if (aoi[i] % n == 0)
                return true;
        return false;
    }

    public static void main(String[] args) {
        int [] a = {2, 12, 18, 27, 33};
        System.out.println(areFactors(a, 3));
    }
}
