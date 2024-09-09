import java.util.LinkedList;
import java.util.Queue;

public class G_045_Queue {
    public static void main(String[] args) {

    }
}

class Solution_G_045_Queue
{
    Queue<Integer> q;
    Solution_G_045_Queue(){
        q=new LinkedList<>();
    }
    public void addElement(int key)
    {
        //Add your code here.
        q.add(key);
    }
    public void RemoveElement()
    {
        //Add your code here.
        if (q.isEmpty()) {
            System.out.print("-1 ");
        } else {
            int x = q.poll();
            System.out.print(x + " ");
        }
    }
    public void peekElement()
    {
        //Add your code here.
        if (q.isEmpty()) {
            System.out.print("-1 ");
        } else {
            int y = q.peek();
            System.out.print(y + " ");
        }
    }
    public void Size()
    {
        //Add your code here.
        System.out.print(q.size()+" ");
    }
}
