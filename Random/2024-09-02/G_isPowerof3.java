public class G_isPowerof3 {
    public static void main(String[] args) {

    }
}

class Solution_G_isPowerof3 {
    static String isPowerOf3(int N){
        if(N==1) return "Yes";
        while(N>=3) {
            if(N%3!=0) { return "No"; }
            N/=3;
        }

        if ( N != 3) return "No";
        return "Yes";
    }
}
