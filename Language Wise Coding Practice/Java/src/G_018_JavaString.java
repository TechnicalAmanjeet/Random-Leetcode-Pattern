public class G_018_JavaString {
    public static void main(String[] args) {

    }
}

class Solution_G_018_JavaString {
    static String conRevstr(String S1, String S2) {
        // code here
        StringBuilder sb = new StringBuilder();

        for (int i= S2.length()-1; i >= 0; i--) {
            sb.append(S2.charAt(i));
        }
        for (int i= S1.length()-1; i >= 0; i--) {
            sb.append(S1.charAt(i));
        }

        return sb.toString();
    }
}
