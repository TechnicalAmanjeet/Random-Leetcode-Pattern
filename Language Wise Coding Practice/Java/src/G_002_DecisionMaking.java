public class G_002_DecisionMaking {
    public static void main(String[] args) {

    }
}

class Solution_G_002_DecisionMaking {
    public static String compareNM(int n, int m) {
        int a = n, b = m;
        // code here
        if (a == b)
            return "equal";
        else if (a < b)
            return "lesser";
        else
            return "greater";
    }
}
