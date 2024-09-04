public class G_Pattern_11 {
    public static void main(String[] args) {

    }
}

class Solution_G_Pattern_11 {

    void printTriangle(int n) {
        // code here
        this.printEleventhPattern(n);
    }

    protected void printEleventhPattern(int n) {
        int number = 0, iterator = 1;

        while (iterator <= n) {
            if (iterator % 2 == 0) {
                number = 1;
            } else {
                number = 0;
            }

            int i = iterator;

            while (i-- > 0) {
                number = getNumberToPrint(number);
                System.out.print(number + " ");
            }

            ++iterator;
            System.out.println();
        }
    }

    protected int getNumberToPrint(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 0) {
            return 1;
        }
        return -1;
    }
}