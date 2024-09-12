package D_2024_09_10;

public class G_007_Pattern1 {
    public static void main(String[] args) {

    }
}

class Solution_G_007_Pattern1 {
    static String[] findThePattern(int N) {
        // code here
        String str="";
        String s[]=new String[N];
        char ch ='A';
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==0||j==0||i==N-1||j==N-1){
                    str=str+ch;
                    ch++;
                    // System.out.print(ch);
                }else{
                    str=str+'$';
                    // System.out.print("$");
                }
            }
            s[i]=str;
            str="";
            // System.out.println();
        }
        return s;
    }
};
