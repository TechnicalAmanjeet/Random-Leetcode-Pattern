public class G_2sComplement {
    public static void main(String[] args) {
        System.out.println(Solution_G_2sComplement.complement("101"));
    }
}

class Solution_G_2sComplement {
    static String complement(String bi){
        char[] chars = new char[bi.length()];
        char carry = '1';
        int sizeOfString = bi.length();

        for (int i = sizeOfString - 1; i >= 0; i--) {
            char charAtIthIndex = bi.charAt(i);

            if (charAtIthIndex == '1') charAtIthIndex = '0'; else charAtIthIndex = '1';

            if (carry == charAtIthIndex) {
                chars[i] = '0';
            } else {
                chars[i] = '1';
                carry = '0';
            }
        }

        return String.valueOf(chars);
    }
}