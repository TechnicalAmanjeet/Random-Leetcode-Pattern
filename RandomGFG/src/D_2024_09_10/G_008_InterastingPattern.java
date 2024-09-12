package D_2024_09_10;

public class G_008_InterastingPattern {
    public static void main(String[] args) {

    }
}

class Solution_G_008_InterastingPattern {
    static String[] interestingPattern(int N) {
        // code here
        String[] str = new String[2*N-1];
        String ans = "";
        for (int i=0; i<2*N-1; i++) {
            ans += N+"";
        }
        int j =0;
        str[j]=str[2*N-2] = ans+"";
        j++;
        for (int i=N-1; i>0; i--) {
            String y = ans.substring(N-i, N+i-1);
            y = y.replaceAll((i+1)+"", i+"");
            ans = ans.substring(0, N-i)+y+ans.substring(N+i-1);
            str[j++] = str[2*N-1-j]= ans+"";
        }


        return str;
    }
};

