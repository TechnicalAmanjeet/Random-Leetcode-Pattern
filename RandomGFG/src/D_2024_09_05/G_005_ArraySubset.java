package D_2024_09_05;

import java.util.HashMap;

public class G_005_ArraySubset {
    public static void main(String[] args) {

    }
}

class Compute_G_005_ArraySubset {
    public String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long, Long> map1 = new HashMap<>(), map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map1.put(a1[i], map1.getOrDefault(a1[i], 0L) + 1);
        }

        for (int i = 0; i < m; i++) {
            map2.put(a2[i], map2.getOrDefault(a2[i], 0L) + 1);
        }

        for (int i = 0; i < m; i++) {
            if (!map1.containsKey(a2[i]) || map1.get(a2[i]) < map2.get(a2[i])) {
                return "No";
            }
        }

        return "Yes";
    }
}
