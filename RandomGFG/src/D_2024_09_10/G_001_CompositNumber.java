package D_2024_09_10;

import java.util.ArrayList;
import java.util.List;

public class G_001_CompositNumber {
    public static void main(String[] args) {

    }
}

class Solution_G_001_CompositNumber {
    static List<Integer> compositeNumbers(int N)
    {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        if(N<4){
            return al;
        }
        for(int i=4;i<=N;i++){
            if(!isPrime(i)){
                al.add(i);
            }
        }
        return al;
    }

    static boolean isPrime(int n){
        if(n==1) return false;
        if(n==2||n==3) return true;
        if(n%2==0||n%3==0) return false;
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0||n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
