public class G_Pattern_10 {
    public static void main(String[] args) {

    }
}

class Solution_G_Pattern_10 {

    void printTriangle(int n) {
        // code here
        int i = 1;

        while (i <= n) {
            int t = i++;

            while (t-- > 0) {
                System.out.print("* ");
            }
            System.out.println();
        }

        --n;
        while (n > 0) {
            i = n;
            while (i-- > 0) {
                System.out.print("* ");
            }
            --n;
            System.out.println();
        }
    }
}

