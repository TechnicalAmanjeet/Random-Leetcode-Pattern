import java.util.Calendar;
import java.util.Formatter;

public class G_047_JavaDateAndDay {
    public static void main(String[] args) {
        Solution_G_047_JavaDateAndDay.findDay(29, 11, 2021);
    }
}

class Solution_G_047_JavaDateAndDay {
    static String findDay(int Day, int Month, int Year){
        //Code Here
        Calendar cal = Calendar.getInstance();
        cal.set(
                Year,
                Month-1,
                Day
        );

        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        switch(dayOfWeek){
            case 1:
                return "Sunday".toUpperCase();
            case 2:
                return "Monday".toUpperCase();
            case 3:
                return "Tuesday".toUpperCase();
            case 4:
                return "Wednesday".toUpperCase();
            case 5:
                return "Thursday".toUpperCase();
            case 6:
                return "Friday".toUpperCase();
            case 7:
                return "Saturday".toUpperCase();
        }

        return null;
    }
}