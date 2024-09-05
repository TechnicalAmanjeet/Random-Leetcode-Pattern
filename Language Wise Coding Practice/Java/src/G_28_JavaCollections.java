import java.util.ArrayList;

public class G_28_JavaCollections {
    public static void main(String[] args) {

    }
}

class Solution_G_28_JavaCollections
 {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query)
    {
        if (Q == 1) {
            A.add(Query.get(0), Query.get(1));
            return A;
        }

        Integer id = -1;
        int queryValue = Query.get(0);

        System.out.println(Query.get(0));
        for (int i = N - 1; i >= 0; i--) {
            int currentValue = A.get(i);
            if (queryValue == currentValue) {
                id = i;
                break;
            }
        }

        Query.remove(Query.size() - 1);
        Query.add(id);

        return Query;
    }
}
