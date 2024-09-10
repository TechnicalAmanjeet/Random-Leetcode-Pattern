package D_2024_09_09;

public class G_005_SumOfArray {
    public static void main(String[] args) {

    }
}

class Solution_G_005_SumOfArray {
    int sum(int arr[]) {
        // code here
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
