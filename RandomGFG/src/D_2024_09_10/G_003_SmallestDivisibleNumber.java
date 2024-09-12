package D_2024_09_10;

public class G_003_SmallestDivisibleNumber {
    public static void main(String[] args) {

    }
}

class Solution_G_003_SmallestDivisibleNumber {
    static long gcd(long a,long b){
        if (b==0) return a;
        return gcd(b,a%b);
    }
    public static long getSmallestDivNum(int n){
        // code here
        long ans=1;
        for(int i=2;i<=n;i++){
            ans=(ans*i)/gcd(ans,i);
        }
        return ans;
    }
}
