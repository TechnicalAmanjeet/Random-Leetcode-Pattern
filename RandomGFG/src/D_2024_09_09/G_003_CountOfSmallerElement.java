package D_2024_09_09;

import java.util.List;

public class G_003_CountOfSmallerElement {
    public static void main(String[] args) {

    }
}

class Solution_G_003_CountOfSmallerElement {
    public int countOfElements(int x, List<Integer> arr) {
        // Code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) <= x) {
                ++count;
            }
        }

        return count;
    }
}
