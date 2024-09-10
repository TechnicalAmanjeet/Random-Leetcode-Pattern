package D_2024_09_09;

public class G_004_PrintElementsOfArray {
    public static void main(String[] args) {

    }
}

class Solution_G_004_PrintElementsOfArray {
    // Just print the space seperated array elements
    void printArray(int arr[]) {
        //   code here
        for ( int item: arr) {
            System.out.printf(item + " ");
        }
    }
}
