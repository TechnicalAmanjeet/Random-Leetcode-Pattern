import java.util.HashSet;

public class G_FirstRepeatedChar {
    public static void main(String[] args) {

    }
}

class Solution_G_FirstRepeatedChar
{
    String firstRepChar(String s)
    {
        HashSet<Character> set = new HashSet<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return String.valueOf(s.charAt(i));
            }

            set.add(s.charAt(i));
        }

        return "-1";
    }
}