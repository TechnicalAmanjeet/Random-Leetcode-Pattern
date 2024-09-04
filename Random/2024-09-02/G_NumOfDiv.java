public class G_NumOfDiv {
    public static void main(String[] args) {

    }
}

class Solution_G_NumOfDiv {
    static int numOfDiv(int m, int n, int a, int b) {
        int count = 0;

        for (int i = m; i <= n; i++) {
            if (i % a==0 ||i % b==0) {
                ++count;
            }
        }

        return count;
    }
};
