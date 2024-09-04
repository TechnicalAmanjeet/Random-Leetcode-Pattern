public class G_016_DeleteAlternateCharecter {
    public static void main(String[] args) {

    }
}

class Solution_G_016_DeleteAlternateCharecter {
    static String delAlternate(String S) {
        // code here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i += 2) {
            sb.append(S.charAt(i));
        }

        return sb.toString();
    }
}
