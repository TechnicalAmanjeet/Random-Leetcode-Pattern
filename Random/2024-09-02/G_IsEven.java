public class G_IsEven {
    public static void main(String[] args) {
        System.out.println(Solution_G_IsEven.isEven("97.4", 4));;
    }
}

class Solution_G_IsEven
{
    static boolean isEven(String s,int n)
    {
        int zflag = 0;
        boolean even = false;
        for(int i=0;i<n;i++){
            if(s.charAt(i)-'0'==0 && zflag ==1) continue; //post decimal zeroes are ignored
            if(s.charAt(i) =='.') zflag = 1; // post decimal zero flag
            if(((s.charAt(i)-'0')%2)==0 && s.charAt(i)!='.') even=true;
            else if (((s.charAt(i)-'0')%2)!=0 && s.charAt(i)!='.')  even=false;
        }
        return even;
    }
}
