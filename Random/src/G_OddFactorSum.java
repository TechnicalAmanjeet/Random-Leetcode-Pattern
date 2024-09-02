public class G_OddFactorSum {
    public static void main(String[] args) {
        System.out.println(Solution_G_OddFactorSum.count(5));
    }
}

class Solution_G_OddFactorSum {
    static long count(int N)
    {
        return (long)Math.sqrt(N);
    }
}

