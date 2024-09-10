package D_2024_09_09;

public class G_015_CountTypeOfCharecter {
    public static void main(String[] args) {

    }
}

class Sol_G_015_CountTypeOfCharecter
{
    int[] count (String s)
    {
        // your code here
        int numric=0, upper=0,lower=0,special=0;
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {++upper;}
            else if(c >= 'a' && c <= 'z') {++lower;}
            else if(c >= '0' && c <= '9') {++numric;}
            else {++special;}
        }

        return new int[]{upper,lower,numric,special};
    }
}
