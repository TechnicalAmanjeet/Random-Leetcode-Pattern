import java.util.HashMap;

public class G_FindTheFreequency {
    public static void main(String[] args) {

    }
}

class Solution_G_FindTheFreequency {
    int findFrequency(int Arr[], int X){
        HashMap<Integer,Integer> map = new HashMap<>();

        for ( int number : Arr) {
            map.put(number,map.getOrDefault(number,0) + 1);
        }

        return map.get(X);
    }
}