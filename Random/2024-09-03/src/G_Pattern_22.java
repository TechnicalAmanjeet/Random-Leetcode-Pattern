public class G_Pattern_22 {
    public static void main(String[] args) {

    }
}


class Solution_G_Pattern_22 {
    static String[] interestingPattern(int N) {
        // code here
        int n = N;
        for(int i=0;i<2*n-1;i++){

            for(int j=0;j<2*n-1;j++){

                int top = i;
                int bottom = j;
                int right = (2*n - 2) - j;
                int left = (2*n - 2) - i;

                System.out.print(n- Math.min(Math.min(top,bottom), Math.min(left,right)));
            }

            System.out.println();
        }
    }
};


