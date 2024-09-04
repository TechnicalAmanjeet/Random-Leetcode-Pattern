import java.util.ArrayList;

public class G_020_1D_And_2D_Array {
    public static void main(String[] args) {

    }
}

class Complete_G_020_1D_And_2D_Array
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        // Complete the function
        int sum = 0, max = b[0], i=0;
        while(i<n) {
            sum += a[i][i];
            if(max < b[i]) max = b[i];
            ++i;
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(sum);
        list.add(max);

        return list;
    }
}

