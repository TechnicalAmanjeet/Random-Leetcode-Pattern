public class G_isStringExist {
    public static void main(String[] args) {

    }
}

class Solution_G_isStringExist {
    static String isStringExist(String arr[],int N,String S){

        for(String str : arr){
            if(str.length() == S.length()){
                int count = -1;

                for(int i=0;i<str.length();i++){
                    if(str.charAt(i) != S.charAt(i)) {
                        ++count;
                    }

                    if(count > 0) {
                        break;
                    }
                }

                if(count == 0) return "True";
            }
        }

        return "False";
    }
}
