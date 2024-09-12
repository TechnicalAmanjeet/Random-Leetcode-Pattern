package D_2024_09_10;

import java.util.ArrayList;

public class G_002_PronicNumber {
    public static void main(String[] args) {

    }
}

class Solution_G_002_PronicNumber {
    static ArrayList<Integer> pronicNumbers(int N){
        // code here
        int i = 1;
        int f = 0;
        int l = 1;
        int pro = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while(pro <= N){
            pro = f*l;
            if(pro>N){
                break;
            }
            al.add(pro);
            f = l;
            l++;
        }
        return al;
    }
}
