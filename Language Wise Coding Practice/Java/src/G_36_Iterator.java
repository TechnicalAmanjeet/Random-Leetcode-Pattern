import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class G_36_Iterator {
    public static void main(String[] args) {

    }
}

class Solution_G_36_Iterator {
    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }

        Iterator<Integer> iterator = result.iterator();

        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if ( i< k) {
                iterator.remove();
            }
        }

        Collections.sort(result);
        return result;
    }

};
