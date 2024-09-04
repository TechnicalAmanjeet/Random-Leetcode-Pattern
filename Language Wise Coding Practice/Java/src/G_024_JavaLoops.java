import java.util.ArrayList;

public class G_024_JavaLoops {
    public static void main(String[] args) {

    }
}

class Solution_G_024_JavaLoops {
    static ArrayList<Integer> getSum(int N){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int evenSum = 0, oddSum = 0;

        for(int i = 0; i <= N; i++){
            if(i % 2 == 0){evenSum += i;}else{oddSum += i;}
        }
        list.add(evenSum);
        list.add(oddSum);

        return list;
    }
}
