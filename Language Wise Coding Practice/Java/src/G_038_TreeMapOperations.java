import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class G_038_TreeMapOperations {
    public static void main(String[] args) {

    }
}

class GfG
{
    /*Inserts an entry with key x and value y in map */
    void add_Value(TreeMap<Integer,Integer> hm, int x, int y)
    {
        //Your code here
        hm.put(x,y);
    }

    /*Returns the value with key x from the map */
    int find_value(TreeMap<Integer, Integer> hm, int x)
    {
        //Your code here
        return hm.getOrDefault(x,-1);
    }

    /*Returns the size of the map */
    int getSize(TreeMap<Integer, Integer> hm)
    {
        //Your code here
        return hm.size();
    }

    /*Removes the entry with key x from the map */
    void removeKey(TreeMap<Integer, Integer> hm, int x)
    {
        //Your code here
        hm.remove(x);
    }

    /*print map sorted by key */
    void sorted_By_Key(TreeMap<Integer, Integer> hm)
    {
        // Your code here
        hm.keySet().stream().map(integer -> integer + " ").forEach(System.out::print);
    }
}
