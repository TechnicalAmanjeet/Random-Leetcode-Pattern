package D_2024_09_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class G_005_PrintAPattern {
    public static void main(String[] args) {

    }
}

class Solution_G_005_PrintAPattern {
    static List<String> pattern(int n){
        // code here
        ArrayList<String> list = new ArrayList<>();

        int num = 1;

        for(int i = 1; i <= n; i++){

            String str = "";

            for(int j = 1; j < i; j++) str = str+"--";

            for(int j = 0; j <= n-i; j++){

                str = str+(num++)+"*";

            }

            list.add(str);

        }

        Stack<String> stack = new Stack<>();

        for(int i = n-1; i >= 0; i--){

            String str = list.get(i);

            for(int j = 0; j < n-i; j++){

                if(j==n-i-1) str = str+(num++);

                else str = str+(num++)+"*";

            }

            stack.push(str);

        }

        list.clear();

        while(!stack.empty()) list.add(stack.pop());

        return list;

    }
}

