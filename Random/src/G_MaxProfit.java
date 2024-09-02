import java.util.Arrays;

public class G_MaxProfit {
    public static void main(String[] args) {
        Solution_G_MaxProfit.maxProfit(2, new int[]{1, -2, -3,-4, 5});
    }
}

class Solution_G_MaxProfit {
    public static int maxProfit(int m, int[] arr) {
        Arrays.sort(arr);
        int profit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (m-- > 0 && arr[i] < 0) {
                profit += arr[i];
            }

            if (m < 0 || arr[i] >= 0) {
                break;
            }
        }

        return profit * -1;
    }
}
