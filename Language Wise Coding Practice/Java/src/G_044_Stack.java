import java.util.Stack;

public class G_044_Stack {
    public static void main(String[] args) {

    }
}

class Solution_G_044_Stack {
    static Stack<Integer> deleteMid(int n, Stack<Integer> st)
    {
        // code here
        int mid = n/2;

        if (n%2 != 0) {
            ++mid;
        }

        st.remove(mid);
        return st;
    }
}
