public class G_Pattern_7 {
    public static void main(String[] args) {

    }
}

class Solution_G_Pattern_7 {
    void printTringle(int n) {
        for (int i = 0; i < n; i++) {
            int numberOfStar = (i * 1) + 1;
            int numberOfSpaceFirstHalf = n - numberOfStar;
            int numberOfSpaceSecondHalf = numberOfSpaceFirstHalf;
            int numberOfStarFirstHalf = numberOfStar - 1;

            while (numberOfSpaceFirstHalf-- > 0) {
                System.out.printf(" ");
            }
            while (numberOfStar-- > 0) {
                System.out.printf("*");
            }

            while (numberOfStarFirstHalf-- > 0) {
                System.out.printf("*");
            }
//
//            while (numberOfSpaceSecondHalf-- > 0) {
//                System.out.printf(" ");
//            }

            System.out.println();
        }
    }
}