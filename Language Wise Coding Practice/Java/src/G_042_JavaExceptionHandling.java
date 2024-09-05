public class G_042_JavaExceptionHandling {
    public static void main(String[] args) {

    }
}

class TestClass
{
    // Add your code here. Define private variables, Constructors to initialize
    // variables with the given values and a method findMin() which prints the
    // Minimum value of a$b.

    int a,b;

    public void TestClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void findMin() {
        try {
            int min = Math.min(Math.min(a+b, a-b), Math.min(a*b, a/b));
            System.out.println(min);
        } catch (Exception e) {
            int min = Math.min(Math.min(a+b, a-b), Math.min(a*b,a+b));
            System.out.println(min);
        }
    }
}
