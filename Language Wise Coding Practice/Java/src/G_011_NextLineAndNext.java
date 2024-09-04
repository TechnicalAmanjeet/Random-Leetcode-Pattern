import java.util.Scanner;

public class G_011_NextLineAndNext {
    public static void main(String[] args) {

    }
}

class Geeks_G_011_NextLineAndNext {
    static void getInput () {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt(); //Taking the number of testcases
        while(t-->0)
        {
            int a = 0;
            String s = "";

            //Your code here
            a = sc.nextInt();
            sc.nextLine();
            s = sc.nextLine();
            System.out.println(a);
            System.out.println(s);
        }

    }
}
