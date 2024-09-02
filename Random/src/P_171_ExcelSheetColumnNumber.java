public class P_171_ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(Solution_P_171_ExcelSheetColumnNumber.titleToNumber("ABCYX"));
    }
}

class Solution_P_171_ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            result = (result * 26) + (columnTitle.charAt(i) - 'A' + 1);
        }

        return result;
    }
}