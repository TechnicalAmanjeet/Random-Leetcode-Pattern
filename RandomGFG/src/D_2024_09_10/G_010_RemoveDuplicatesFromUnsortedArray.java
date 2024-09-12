package D_2024_09_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class G_010_RemoveDuplicatesFromUnsortedArray {
    public static void main(String[] args) {

    }
}

class Solution_G_010_RemoveDuplicatesFromUnsortedArray {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        Set<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                list.add(arr[i]);
            }
        }

        return list;
    }
}
