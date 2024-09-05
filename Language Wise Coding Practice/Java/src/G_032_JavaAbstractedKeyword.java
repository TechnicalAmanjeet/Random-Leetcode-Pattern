public class G_032_JavaAbstractedKeyword {
    public static void main(String[] args) {

    }

    void m1(int p,int q) {
        // Add your code here.
        System.out.println(p*q);
    }
}

abstract class A
{
    int prod;
    abstract void m1(int p,int q);
    void m2()
    {
        System.out.println(prod);
    }
}

class B extends A
{
    void m1(int p,int q) {
        // Add your code here.
        this.prod = p*q;
    }
}