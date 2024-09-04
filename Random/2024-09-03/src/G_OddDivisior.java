public class G_OddDivisior {
    public static void main(String[] args) {
        System.out.println(Solution_G_OddDivisior.oddNumberOfDivisor(89384));
    }
}

class Solution_G_OddDivisior {
    static int oddNumberOfDivisor(int N){
        return (int)Math.sqrt(N);
    }
}
