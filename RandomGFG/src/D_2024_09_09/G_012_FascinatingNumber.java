package D_2024_09_09;

public class G_012_FascinatingNumber {
    public static void main(String[] args) {
        Solution_G_012_FascinatingNumber.fascinatingNumber(783);
    }
}

class Solution_G_012_FascinatingNumber {
    static boolean fascinatingNumber(int n) {
        long x = n;
        int[] count = new int[10];
        while (x > 0) {
            count[(int) x % 10]++;
            x/=10;
        }
        x = n*2;
        while (x > 0) {
            count[(int)x % 10]++;
            x/=10;
        }
        x = n*3;
        while (x > 0) {
            count[(int)x % 10]++;
            x/=10;
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] < 1) {
                return false;
            }
        }

        return true;
    }
}
