import java.util.HashMap;

public class G_GetMaximumOccuringCharecter {
    public static void main(String[] args) {
        Solution_G_GetMaximumOccuringCharecter.getMaxOccuringChar("testsample");
    }
}

class Solution_G_GetMaximumOccuringCharecter
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        char max = line.charAt(0);
        int maxCount = 1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;

        while (count < line.length()) {
            map.put(line.charAt(count), map.getOrDefault(line.charAt(count), 0) + 1);
            if (map.get(line.charAt(count)) > maxCount) {
                max = line.charAt(count);
                maxCount = map.get(line.charAt(count));
            } else if (map.get(line.charAt(count)) == maxCount) {
                if (max > line.charAt(count)) {
                    max = line.charAt(count);
                }
            }

            ++count;
        }

        return max;
    }

}
