public class G_Pattern_6 {
    public static void main(String[] args) {

    }
}

class Solution_G_Pattern_6 {

    void printTriangle(int n) {
        // code here
        while (n > 0) {
            int i = 1;
            while (i<=n) {
                System.out.print(i + " ");
                ++i;
            }
            System.out.println();
            --n;
        }
    }
}
