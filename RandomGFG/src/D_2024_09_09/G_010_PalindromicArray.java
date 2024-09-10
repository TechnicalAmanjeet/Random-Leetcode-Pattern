package D_2024_09_09;

public class G_010_PalindromicArray {
    public static void main(String[] args) {

    }
}

class Solution_G_010_PalindromicArray {
    public static boolean palinArray(int[] arr) {
        // add code here.
        for (int item: arr) {
            if (!isPalindrome(String.valueOf(item))) {
                return false;
            }
        }
        return true;
    }

    protected static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            ++left;
            --right;
        }

        return true;
    }
}
