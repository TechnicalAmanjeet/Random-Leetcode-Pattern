import java.util.HashSet;

public class G_IsPossible {
    public static void main(String[] args) {

    }
}

class Solution_G_IsPossible {
    static int isPossible(String S){
        HashSet s = new HashSet();

        for (int i = 0; i < S.length(); i++) {
            s.add(S.charAt(i));

            if (s.size() >=4) {
                return 1;
            }
        }

        return 0;
    }
}