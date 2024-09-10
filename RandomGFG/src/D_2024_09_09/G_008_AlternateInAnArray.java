package D_2024_09_09;

public class G_008_AlternateInAnArray {
    public static void main(String[] args) {

    }
}

class Solution_G_008_AlternateInAnArray {
    public static void print(int arr[]) {
        // your code here
        for (int i = 0; i < arr.length; i+=2) {
            System.out.print(arr[i] + " ");
        }
    }
}

