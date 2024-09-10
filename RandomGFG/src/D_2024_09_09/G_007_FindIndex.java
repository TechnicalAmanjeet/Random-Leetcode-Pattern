package D_2024_09_09;

public class G_007_FindIndex {
    public static void main(String[] args) {

    }
}

class Solution_G_007_FindIndex {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        // code here.
        int firstIndex = -1, lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (firstIndex == -1) {
                    firstIndex = i;
                    lastIndex = i;
                } else {
                    lastIndex = i;
                }
            }
        }

        return new int[]{firstIndex, lastIndex};
    }
}

