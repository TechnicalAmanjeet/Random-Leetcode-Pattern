package D_2024_09_09;

public class G_019_CountDigitInFactorial {
    public static void main(String[] args) {

    }
}

class Solution_G_019_CountDigitInFactorial {
    static int facDigits(int N){
        //code here
        long fact = 1, count =1;
        while(count<=N){
            fact = fact * count;
            ++count;
        }

        return (int)Math.log10(fact) + 1;
    }
}


