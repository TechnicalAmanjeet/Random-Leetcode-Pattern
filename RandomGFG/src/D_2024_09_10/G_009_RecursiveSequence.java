package D_2024_09_10;

public class G_009_RecursiveSequence {
    public static void main(String[] args) {

    }
}

class Solution_G_009_RecursiveSequence {
    static long sequence(int n) {
        // code here
        long ans = 0;
        long j = 1;
        long count = 1;
        while (n-- > 0) {
            long a = 1;
            for (long i = 0; i < j; i++) {
                a = (a * count) % (1000000007);
                count += 1;
            }
            j++;
            ans += a;
        }
        return (ans % 1000000007);
    }
}
