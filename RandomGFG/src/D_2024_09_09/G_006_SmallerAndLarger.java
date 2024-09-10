package D_2024_09_09;

public class G_006_SmallerAndLarger {
    public static void main(String[] args) {

    }
}

class Solution_G_006_SmallerAndLarger {
    int[] getMoreAndLess(int[] arr, int x) {
        // code here
        int smaller=0, larger=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) { smaller++; }
            else if(arr[i] > x) {larger++; }
            else {
                smaller++;
                larger++;
            }
        }

        return new int[]{smaller, larger};
    }
}
