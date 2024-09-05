public class G_039_LinkedList {
    public static void main(String[] args) {

    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class GfG_G_039_LinkedList
{
    public void deleteNode(Node node) {
        //Add your code here
        node.data = node.next.data;
        node.next = node.next.next;
    }
}