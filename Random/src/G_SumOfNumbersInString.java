public class G_SumOfNumbersInString {
    public static void main(String[] args) {

    }
}

class Solution_G_SumOfNumbersInString
{
    public static long findSum(String str)
    {
        int i = 0, sum = 0;

        while (i < str.length()) {
            if (checkIfCharIsIntOrNot(str.charAt(i))) {
                StringBuilder st = new StringBuilder();

                while (checkIfCharIsIntOrNot(str.charAt(i)) && i < str.length()) {
                    st.append(str.charAt(i));
                    ++i;
                }

                sum += Integer.parseInt(st.toString());
            } else {
                ++i;
            }
        }

        return sum;
    }

    public static boolean checkIfCharIsIntOrNot(char ch) {
        return ch >= '0' && ch <= '9';
    }

}
