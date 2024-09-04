public class G_Pattern_13 {
    public static void main(String[] args) {

    }
}

class Solution_G_Pattern_13 {

    void printTriangle(int n) {
        int num = 1, i = 1;

        while (i <= n) {
            int j= i;

            while ( j-- > 0) {
                System.out.print(num++ + " ");
            }
            System.out.println();
            ++i;
        }
    }
}