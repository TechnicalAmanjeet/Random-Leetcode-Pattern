import java.util.ArrayList;

public class P_168_ExcelSheetColumTile {
    public static void main(String[] args) {
        System.out.println(Solution_P_168_ExcelSheetColumTile.convertToTitle(701));
    }
}

class Solution_P_168_ExcelSheetColumTile {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            --columnNumber;
            int remainder = columnNumber % 26;

            char sign = (char) ('A' + remainder);
            sb.append(sign);
            columnNumber /= 26;
        }

        StringBuilder result = new StringBuilder();
        String actualData = sb.toString();
        for (int i = actualData.length()-1; i>= 0; i--) {
            result.append(actualData.charAt(i));
        }

       return result.toString();
    }
}