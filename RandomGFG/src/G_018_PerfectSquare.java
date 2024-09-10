public class G_018_PerfectSquare {
    public static void main(String[] args) {

    }
}

class Solution_G_018 {
    static int checkPerfectSquare(int N){
        // code here
        long ps = (int)Math.sqrt(N);

        if ((int)(ps * ps) == N) {
            return 1;
        }

        return 0;
    }
}
