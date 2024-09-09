package GFG;

public class P_2024_09_05 {
    public static void main(String[] args) {

    }
}

class Solution_P_2024_09_05 {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
        int totalSum = (n * (n + 1)) / 2;

        for (int data: arr) {
            totalSum -= data;
        }

        return totalSum;
    }
}
