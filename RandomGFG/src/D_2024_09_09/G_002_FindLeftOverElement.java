package D_2024_09_09;

import java.util.Arrays;

public class G_002_FindLeftOverElement {
    public static void main(String[] args) {

    }
}

class Solution_G_002_FindLeftOverElement {
    public static int leftElement(int[] arr) {
        // code here
        Arrays.sort(arr);

        if (arr.length %2 == 0) {
            return arr[(arr.length / 2) - 1];
        }

        return arr[arr.length/2];
    }
}
