public class G_NarcissisticNumber {
    public static void main(String[] args) {

    }
}

class Solution_G_NarcissisticNumber {
    static int isNarcissistic(int N){
        if (N == isNarcissistic2(N)) return 1;
        return 0;
    }

    static int isNarcissistic2(int N){
        int numberOfDigit = (int) Math.log10(N) + 1;

        int sum = 0;
        while (N > 0) {
            sum += Math.pow((N % 10), numberOfDigit);
            N /= 10;
        }

        return sum;
    }
}