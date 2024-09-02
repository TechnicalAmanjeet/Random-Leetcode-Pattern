public class G_EvenFactorSum {
    public static void main(String[] args) {
        System.out.println(Solution_G_EvenFactorSum.evenFactors(30));
    }
}

class Solution_G_EvenFactorSum {
    static int evenFactors(int N)
    {
        int sum = 0, loopMaxValue = (int)(Math.sqrt(N)) + 1, count = 1;

        while (count < loopMaxValue) {
            if (N % count == 0) {
                int first = N / count;

                if (first %2 == 0) sum += first;
                if (count %2 == 0) sum += count;

                if (count %2 == 0 && count == first) sum -=count;
            }

            ++count;
        }

        return sum;
    }
}
