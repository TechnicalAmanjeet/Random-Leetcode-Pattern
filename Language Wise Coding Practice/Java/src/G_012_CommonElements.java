import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class G_012_CommonElements {
    public static void main(String[] args) {
        Solution_G_012_CommonElements.common_element(
                new int[] {3, 4, 2, 2, 4},
                new int[] {3, 2, 2, 7}
        );
    }
}

class Solution_G_012_CommonElements {
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        int[] v1a = new int[100005];
        int[] v2a = new int[100005];

        for (int i = 0; i < v1.length; i++) {
            v1a[v1[i]]++;
        }

        for (int i = 0; i < v2.length; i++) {
            v2a[v2[i]]++;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < v1a.length; i++) {
            int min = Math.min(v1a[i], v2a[i]);
            while(min-- > 0) {
                list.add(i);
            }
        }

        return list;
    }
}

