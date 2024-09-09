package D_2024_09_05;

public class G_001_PeakElement {
    public static void main(String[] args) {
        System.out.println(Solution_G_001_PeakElement.peakElement(new int[]{1,2,3}, 3));
    }
}

class Solution_G_001_PeakElement
{
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        if (peakElementBoolean(arr, n)) {
            return 1;
        }

        return 0;
    }

    public static boolean peakElementBoolean(int[] arr,int n)
    {
        //add code here.
        if(arr.length == 1) {
            return true;
        }

        for(int i=1;i<n-2;++i) {
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]) {
                return true;
            }
        }

        if (arr[0] >= arr[1]) {
            return true;
        }

        if(arr[n-1] >= arr[n-2]) {
            return true;
        }

        return false;
    }
}

