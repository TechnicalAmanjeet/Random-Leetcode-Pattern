public class G_convertfive {
    public static void main(String[] args) {

    }
}

class Solution_G_convertfive {
    int convertfive(int num) {
        // Your code here
        String str = String.valueOf(num);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                sb.append('5');
            } else {
                sb.append(str.charAt(i));
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
