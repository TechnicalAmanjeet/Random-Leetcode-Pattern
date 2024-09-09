import java.util.Iterator;
import java.util.TreeSet;

public class G_049_JavaTreeSet {
    public static void main(String[] args) {

    }
}

class gfg1
{
    void task(TreeSet<String> ts, char a, char b, char c, char d)
    {
        // Add your code here. Print the output here itself.
        TreeSet<String> ts1 = new TreeSet<>();
        TreeSet<String> ts2 = new TreeSet<>();
        TreeSet<String> ts3 = new TreeSet<>();

        for(String val: ts){
            char ch = val.charAt(0);
            if(ch < a){
                ts1.add(val);
            }
            if(ch >=b){
                ts2.add(val);
            }
            if(ch>= c && ch<d){
                ts3.add(val);
            }
        }
        System.out.println(ts1);
        System.out.println(ts2);
        System.out.println(ts3);
    }
}
