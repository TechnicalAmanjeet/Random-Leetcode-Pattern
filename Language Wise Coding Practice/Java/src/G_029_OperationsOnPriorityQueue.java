import java.util.PriorityQueue;

public class G_029_OperationsOnPriorityQueue {
    public static void main(String[] args) {

    }
}

class Geeks_G_029_OperationsOnPriorityQueue {

    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k){

        // Your code here
        //Just insert k in q and don't return anything
        q.add(k);
    }

    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k){

        // Your code here
        // If k is in q return true else return false
        return q.contains(k);
    }

    // Function to delete the max element from queue
    static int delete(PriorityQueue<Integer> q){

        // Your code here
        //Delete the max element from q. The priority queue property might be useful here
        int maxElement = q.poll();

        return maxElement;
    }

}