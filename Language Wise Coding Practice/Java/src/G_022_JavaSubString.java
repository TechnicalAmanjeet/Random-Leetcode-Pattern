public class G_022_JavaSubString {
    public static void main(String[] args) {

    }
}

class Solution_G_022_JavaSubString {
    static String javaSub(String S, int L, int R) {
        // code here
        StringBuilder sb = new StringBuilder();

        for (int i = L; i <= R; i++) {
            sb.append(S.charAt(i));
        }
        return sb.toString();
    }
}
