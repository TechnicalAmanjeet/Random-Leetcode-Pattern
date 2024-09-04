public class G_EvenOdd {
    public static void main(String[] args) {
        System.out.println(Sol_G_EvenOdd.EvenOdd("asfdasf", "asfdasf"));
    }
}

class Sol_G_EvenOdd
{
    static int EvenOdd(String n1 , String n2)
    {
        if (Integer.parseInt(String.valueOf(n1.charAt(n1.length()-1))) % 2 != 0 && Integer.parseInt(String.valueOf(n2.charAt(n2.length()-1))) % 2 != 0) {
            return 0;
        }

        return 1;
    }
}
