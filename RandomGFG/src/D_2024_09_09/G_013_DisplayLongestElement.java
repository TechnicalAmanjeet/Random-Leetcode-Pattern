package D_2024_09_09;

import java.util.List;

public class G_013_DisplayLongestElement {
    public static void main(String[] args) {

    }
}

class Solution {
    public String longest(List<String> names) {
        // code here
        String longest=names.get(0);
        for(int i=1;i<names.size();i++){
            if(names.get(i).length()>longest.length()){
                longest=names.get(i);
            }
        }
        return longest;
    }
}
