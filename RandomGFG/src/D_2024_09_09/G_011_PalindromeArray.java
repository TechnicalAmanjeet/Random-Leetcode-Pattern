package D_2024_09_09;

public class G_011_PalindromeArray {
    public static void main(String[] args) {

    }
}

class Solution_G_011_PalindromeArray {
    public static boolean isPerfect(int[] arr) {
        // code here
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            ++left;
            --right;
        }

        return true;
    }
}