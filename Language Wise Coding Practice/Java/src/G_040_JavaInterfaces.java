public class G_040_JavaInterfaces {
    public static void main(String[] args) {

    }
}

class testClass implements in1
{
    public void display(int k)
    {
        // Add your code here.
        int numberOfPrimeNumber = 0;
        for (int i = 2; i <= k; i++) {
            if (isPrime(i)) {
                ++numberOfPrimeNumber;
            }
        }

        System.out.println(numberOfPrimeNumber);
    }

    boolean isPrime(int n) {
        if(n == 2) return true;

        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) return false;
        }

        return true;
    }
}

interface in1
{
    void display(int p);
}
