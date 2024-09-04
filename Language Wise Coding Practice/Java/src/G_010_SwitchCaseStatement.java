import java.util.List;

public class G_010_SwitchCaseStatement {
    public static void main(String[] args) {

    }
}

class Solution_G_010_SwitchCaseStatement {
    static double switchCase(int choice, List<Double> arr){
        // code here
        switch (choice) {
            case 1:
                return Math.pow(arr.get(0), 2) * Math.PI;
            case 2:
                return arr.get(0) * arr.get(1);
            default:
                return 0;
        }
    }
}
