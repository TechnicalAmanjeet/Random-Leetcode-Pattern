package D_2024_09_09;

import java.util.List;

public class G_009_SwapKthElement {
    public static void main(String[] args) {

    }
}

class Solution_G_009_SwapKthElement {
    public void swapKth(int k, List<Integer> arr) {
        // code here
//        k %= arr.size();
        if (k < arr.size()) {
            int temp = arr.get(k-1);
            arr.set(k-1, arr.get(arr.size()-k));
            arr.set(arr.size()-k, temp);
        }
    }
}

