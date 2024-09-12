package D_2024_09_10;

import java.util.ArrayList;
import java.util.List;

public class G_004_PrintPattern {
    public static void main(String[] args) {

    }
}

class Solution_G_004_PrintPattern {
    public List<Integer> pattern(int N){
        // code here
        int x = N;
        List<Integer> res = new ArrayList<>();
        while (x > 0) {
            res.add(x);
            x-=5;
        }
        while (x<=N) {
            res.add(x);
            x+=5;
        }

        return res;
    }
}

