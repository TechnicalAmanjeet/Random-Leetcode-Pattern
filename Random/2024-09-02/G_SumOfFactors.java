public class G_SumOfFactors {
    public static void main(String[] args) {

    }
}

class Solution_G_SumOfFactors {
    int sumOfFactors(int N) {
        int minSum = Integer.MAX_VALUE;
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                int sum = ( i + (N/i));
                if (minSum > sum) {
                    minSum = sum;
                }
            }
        }

        return minSum;
    }
};

