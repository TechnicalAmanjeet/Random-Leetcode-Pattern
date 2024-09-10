package D_2024_09_09;

public class G_016_FactorialNumber {
    public static void main(String[] args) {

    }
}

class Solution{
    static long factorial(int N){
        // code here
        if(N == 0) return 1;

        long res = 1;
        while(N > 1){
            res *= N;
            --N;
        }

        return res;
    }
}
