public class G_013_JavaArrays {
    public static void main(String[] args) {

    }
}

class Solution_G_013_JavaArrays {
    public String average(int arr[]) {
        // code here
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = sum / arr.length;

        return String.format("%.2f", avg);
    }
}
