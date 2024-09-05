public class G_31_AnagramString {
    public static void main(String[] args) {

    }
}

class Solution_G_31_AnagramString {
    static int areAnagram(String S1, String S2) {
        // code here
        if (S1.length() != S2.length()) {
            return 0;
        }

        char[] s1count = new char[26], s2count = new char[26];
        for (int i = 0; i < S1.length(); i++) {
            s1count[S1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < S2.length(); i++) {
            s2count[S2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (s1count[i] != s2count[i]) {
                return 0;
            }
        }

        return 1;
    }
}
