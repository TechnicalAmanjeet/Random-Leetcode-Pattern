package D_2024_09_10;

public class G_006_MakeADistinctDigitArray {
    public static void main(String[] args) {

    }
}

class Solution_G_006_MakeADistinctDigitArray
{
    public int[] common_digits(int[] nums)
    {
        // code here
        int[] digits = new int[10];

        for (int num: nums) {
            while(num > 0) {
                digits[num%10]++;
                num /= 10;
            }
        }
        int count = 0;
        for (int i=0;i<digits.length;i++) {
            if (digits[i] > 0) {++count;}
        }

        int[] res = new int[count];
        count = 0;
        for (int i=0;i<digits.length;i++) {
            if (digits[i] > 0) {
                res[count++] = i;
            }
        }

        return res;
    }
}
