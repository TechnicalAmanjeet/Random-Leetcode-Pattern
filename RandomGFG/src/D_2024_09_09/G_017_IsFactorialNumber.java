package D_2024_09_09;

public class G_017_IsFactorialNumber {
    public static void main(String[] args) {

    }
}

class Solution_G_017_IsFactorialNumber {
    static int isFactorial(int N) {
        //code here
        long count = 1, factorial = 1;
        while (factorial < N) {
            factorial *= count;
            ++count;
        }
        if (factorial == N) {
            return 1;
        }
        return 0;
    }
}
