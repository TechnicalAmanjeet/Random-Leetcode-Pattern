import java.util.Scanner;

public class G_005_TakingInput {
    public static void main(String[] args) {

    }
}

class Geeks_G_005_TakingInput {

    // Function to take input using Scanner class
    static void IOFunction() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a=sc.nextInt();
            float b=sc.nextFloat();
            long c=sc.nextLong();
            byte d=sc.nextByte();
            sc.nextLine();
            String s=sc.nextLine();

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(s);
        }
    }
}
