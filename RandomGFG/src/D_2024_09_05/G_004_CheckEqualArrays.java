package D_2024_09_05;

import java.util.Arrays;

public class G_004_CheckEqualArrays {
    public static void main(String[] args) {

    }
}

class Solution_G_004_CheckEqualArrays {
    // Function to check if two arrays are equal or not.
    public static boolean check(int[] arr1, int[] arr2) {
        // Your code here
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]) return false;
        }

        return true;
    }

    public static boolean check2(int[] arr1, int[] arr2) {
        // Your code here
        if(arr1.length != arr2.length) return false;

        long sum1=0, sum2=0;
        for(int i = 0; i < arr1.length; i++){
            sum1 += arr1[i];
            sum2 += arr2[i];
        }

        if(sum1 != sum2) return false;

        return true;
    }
}
