import java.util.HashSet;
import java.util.Set;

public class G_037_UniqueSubString {
    public static void main(String[] args) {

    }
}

class Solution_G_037_UniqueSubString {

    public static int unique_substring(String str) {
        Set<String> uniqueSubstrings = new HashSet<>();

        for (int length = 1; length <= str.length(); length++) {
            for (int i = 0; i <= str.length() - length; i++) {
                String substring = str.substring(i, i + length);
                uniqueSubstrings.add(substring);
            }
        }

        return uniqueSubstrings.size();
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Number of unique substrings: " + unique_substring(str));
    }
}
