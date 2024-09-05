import java.util.HashMap;

public class G_35_JavaCollectionHashMap {
    public static void main(String[] args) {

    }
}

class Solution_G_35_JavaCollectionHashMap {
    static int map(int n, String keys[], int arr[], String s)
    {
        // code here
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            hm.put(keys[i], arr[i]);
        }

        return hm.getOrDefault(s, -1);
    }
}
