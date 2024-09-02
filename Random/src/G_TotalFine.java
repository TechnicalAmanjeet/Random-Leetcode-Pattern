public class G_TotalFine {
    public static void main(String[] args) {
        System.out.println(Solution_G_TotalFine.totalFine(12, new int[]{12,23}, new int[]{14,35}));
    }
}

class Solution_G_TotalFine {
    public static long totalFine(int date, int car[], int fine[]) {
        int n = 0;
        if ( date % 2== 0) n = 1;
        int totalFine = 0;

        for (int i = 0; i < fine.length; i++) {
            if (car[i] %2== n) {
                totalFine += fine[i];
            }
        }

        return totalFine;
    }
}
