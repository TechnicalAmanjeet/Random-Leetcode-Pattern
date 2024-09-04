public class G_BinaryNumberToDecimalNumber {
    public static void main(String[] args) {

    }
}

class Solution_G_BinaryNumberToDecimalNumber {
    public int binary_to_decimal(String str) {
        int decimalSum = 0;

        for (int i = str.length(); i>0; i--) {
            if (str.charAt(i-1) == '1') {
                decimalSum = decimalSum + (int)Math.pow(2, (str.length() - i));
            }
        }

        return decimalSum;
    }
}
