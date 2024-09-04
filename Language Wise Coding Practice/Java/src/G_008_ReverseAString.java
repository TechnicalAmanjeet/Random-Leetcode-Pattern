public class G_008_ReverseAString {
    public static void main(String[] args) {
        System.out.println(Solution_G_008_ReverseAString.revStr("aman"));
    }
}

class Solution_G_008_ReverseAString {
    static String revStr(String s) {
        // code here
        char[] arr = s.toCharArray();

        for (int i = 0; i< arr.length; i++) {
            arr[i] = s.charAt(arr.length - i - 1);
            arr[arr.length - i - 1] = s.charAt(i);
        }

        return new String(arr);
    }

    static String revStr2(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static String revStr3(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
