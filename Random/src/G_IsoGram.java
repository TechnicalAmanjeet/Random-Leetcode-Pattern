import java.util.HashSet;

public class G_IsoGram {
    public static void main(String[] args) {

    }
}

class Solution_G_IsoGram
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        HashSet<Character> set = new HashSet<Character>();

        for(int i=0; i<data.length(); i++){
            if(set.contains(data.charAt(i))){
                return false;
            }
            set.add(data.charAt(i));
        }

        return true;
    }
}