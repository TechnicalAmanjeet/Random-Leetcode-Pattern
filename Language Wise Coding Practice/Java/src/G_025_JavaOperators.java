public class G_025_JavaOperators {
    public static void main(String[] args) {

    }
}

class Solution_G_025_JavaOperators {
    static void relationalOperators(int A,int B){
        if (A>B) {
            System.out.println(String.valueOf(A) + " is greater than " + String.valueOf(B));
        } else if (A<B) {
            System.out.println(String.valueOf(A) + " is less than " + String.valueOf(B));
        } else {
            System.out.println(String.valueOf(A) + " is equals than " + String.valueOf(B));
        }
    }
}
