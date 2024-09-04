public class G_015_IsVowel {
    public static void main(String[] args) {

    }
}

class Solution_G_015_IsVowel {
    String isVowel(char c){
        // code here
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'

        ){
            return "YES";
        }

        return "NO";
    }

    static String isVowel2(char c){
        return "aeiouAEIOU".contains(String.valueOf(c)) ? "YES" : "NO";
    }
}
