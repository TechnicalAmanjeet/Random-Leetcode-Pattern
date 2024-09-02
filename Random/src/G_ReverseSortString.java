public class G_ReverseSortString {
    public static void main(String[] args) {
        Solution_G_ReverseSortString.ReverseSort("olutioneverseorttring");
    }
}

class Solution_G_ReverseSortString
{
    static String ReverseSort(String str)
    {
        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i>=0; i--) {
            int count = arr[i];

            while (count-- > 0) {
                sb.append((char)('a' + i));
            }
        }

        return sb.toString();
    }
}