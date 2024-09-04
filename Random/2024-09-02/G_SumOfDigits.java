public class G_SumOfDigits {
    public static void main(String[] args) {

    }
}

class Solution_G_SumOfDigits {
    static int sumOfDigits(int N) {
        int sum = 0;
        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }
        return sum;
    }
}