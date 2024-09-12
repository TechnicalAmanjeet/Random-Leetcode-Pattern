package D_2024_09_10;

import java.util.Arrays;

public class G_010_PrintAnArrayInPendulamArgument {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] pendulumArrangement(int arr[]) {
        // Write your code here
        int n = arr.length;
        int[] a=new int[n];
        Arrays.sort(arr);
        int k=0;
        for(int i=n%2==0?n-2:n-1;i>=0;i=i-2){
            a[k++]=arr[i];
        }
        for(int i=1;i<n;i=i+2){
            a[k++]=arr[i];
        }
        return a;
    }
}
