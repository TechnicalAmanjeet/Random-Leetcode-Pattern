import java.util.ArrayList;
import java.util.List;

public class G_SwapTwoNumberWithUsingTemp {
    public static void main(String[] args) {

    }
}

class Solution_G_SwapTwoNumberWithUsingTemp {
    static List<Integer> get(int a, int b)
    {
        b = a + b;
        a = b - a;
        b = b -a ;

        List<Integer> val = new ArrayList<>();
        val.add(a);
        val.add(b);
        return val;
    }
}
