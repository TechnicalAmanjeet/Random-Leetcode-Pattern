public class G_isPowerOfAnother {
    public static void main(String[] args) {

    }
}

class Solution_G_isPowerOfAnother {
    static Long isPowerOfAnother(Long X, Long Y){
        long output = 1;
        if(Y==1) return output;

        while(Y>X) {
            if(Y%X!=0) {
                output = 0;
                return output;
            }
            Y/=X;
        }

        if ( Y != X) {
            output = 0;
            return output;
        }
        return output;
    }

    protected static long isPowerOfAnotherMethod2(Long X, Long Y){
        long one = 1, zero = 0;
        for(int i=0;i<=Y;i++)
        {
            if(Math.pow(X,i)==Y)
            {
                return one;
            }
        }

        return zero;
    }
}


