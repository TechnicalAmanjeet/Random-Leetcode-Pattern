public class P_2119_ANumberAfterDoubleReversal {
    public static void main(String[] args) {
        System.out.println(Solution_P_2119_ANumberAfterDoubleReversal.isSameAfterReversals(526));
    }
}

class Solution_P_2119_ANumberAfterDoubleReversal {
    public static boolean isSameAfterReversals(int num) {
        String numStr = String.valueOf(num);

        if (numStr.length() > 1 && numStr.charAt(numStr.length() - 1) == '0') {
            return false;
        }

        return true;
    }
}
