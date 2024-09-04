public class G_Pattern_8 {
    public static void main(String[] args) {

    }
}


class Solution {

    void printTriangle(int n) {
        // code here
        for (int i = n-1; i >= 0; i--) {
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

//            while (numberOfSpaceSecondHalf-- > 0) {
//                System.out.printf(" ");
//            }

            System.out.println();
        }
    }
}
