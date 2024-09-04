public class G_LastIndex {
    public static void main(String[] args) {

    }
}

class Solution_G_LastIndex{
    int LastIndex(String s, char p){

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==p){
                return i;
            }
        }

        return -1;
    }
}


