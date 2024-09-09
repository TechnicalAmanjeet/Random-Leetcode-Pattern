package D_2024_09_05;

import java.util.HashSet;

public class G_003_DoUnion {
    public static void main(String[] args) {

    }
}

class Solution_G_003_DoUnion {
    public static int doUnion(int arr1[], int arr2[]) {
        // Your code here
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set1.add(arr2[i]);
        }

        return set1.size();
    }
}
