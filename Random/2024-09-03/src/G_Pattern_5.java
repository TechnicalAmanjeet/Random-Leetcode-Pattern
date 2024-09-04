public class G_Pattern_5 {
    public static void main(String[] args) {

    }
}

class Solution_G_Pattern_5 {

    void printTriangle(int n) {
        // code here
        while (n > 0) {
            int i = n;
            while (i-- > 0) {
                System.out.print("* ");
            }
            --n;
            System.out.println();
        }
    }
}
