public class G_concatenatedString {
    public static void main(String[] args) {

    }
}

class Solution_G_concatenatedString
{
    public static String concatenatedString(String s1,String s2)
    {
        StringBuffer sba = new StringBuffer(), sbb = new StringBuffer();

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            boolean notContainInC = true;

            for (int j = 0; j < s2.length(); j++) {
                if (c == s2.charAt(j)) {
                    notContainInC = false;
                    break;
                }
            }

            if (notContainInC) {sba.append(c);}
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            boolean notContainInC = true;

            for (int j = 0; j < s1.length(); j++) {
                if (c == s1.charAt(j)) {
                    notContainInC = false;
                    break;
                }
            }

            if (notContainInC) {sbb.append(c);}
        }

        String sbbt = sbb.toString();

        for (int i = 0; i < sbbt.length(); i++) {
            sba.append(sbbt.charAt(i));
        }

        if (sba.toString().length() == 0) {
            return "-1";
        }

        return sba.toString();
    }
}