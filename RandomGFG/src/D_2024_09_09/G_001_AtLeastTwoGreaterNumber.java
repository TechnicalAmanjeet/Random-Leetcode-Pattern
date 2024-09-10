package D_2024_09_09;

import java.util.Arrays;

public class G_001_AtLeastTwoGreaterNumber {
    public static void main(String[] args) {

    }
}

class Solution {
    public long[] findElements(long arr[]) {
        // Your code goes here
        Arrays.sort(arr);
        long[] res = new long[arr.length-2];
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[i];
        }

        return res;
    }
}
