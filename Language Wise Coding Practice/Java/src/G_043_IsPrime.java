public class G_043_IsPrime {
    public static void main(String[] args) {


    }
}

class Solution_G_043_IsPrime
{
    public int isPrime(int N)
    {
        // code here
        if (isPrimeData(N)) {
            return 1;
        }

        return 0;
    }


    public static boolean isPrimeData(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }

        return true;
    }
}
