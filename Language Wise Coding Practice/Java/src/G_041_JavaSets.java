import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class G_041_JavaSets {
    public static void main(String[] args) {

    }
}

class GfG_G_041_JavaSets
{
    /*inserts an element x to the set s */
    void insert(Set<Integer> s, int x)
    {
        // Your code here
        s.add(x);
    }

    /*prints the contents of the set s in ascending order */
    void print_contents(Set<Integer> s)
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(Integer i : s) {
            list.add(i);
        }
        Collections.sort(list);

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }

    /*erases an element x from the set s */
    void erase(Set<Integer> s, int x)
    {
        // Your code here
        s.remove(x);
    }

    /*returns the size of the set s */
    int size(Set<Integer> s)
    {
        // Your code here
        return s.size();
    }

    /*returns 1 if the element x is
    present in set s else returns -1 */
    int find(Set<Integer> s, int x)
    {
        // Your code here
        if (s.contains(x)) return 1;

        return -1;
    }
}
