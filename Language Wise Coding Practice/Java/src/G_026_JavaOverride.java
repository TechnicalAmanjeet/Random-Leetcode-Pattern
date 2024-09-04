public class G_026_JavaOverride {
    public static void main(String[] args) {

    }
}

class Child extends Parent
{
    @Override
    void show(int p) { System.out.print(p+" "); }

    @Override
    void print(int q)
    {
        //Add your code here.
        System.out.print(q*q+" ");
    }
}

class Parent {
    void show(int p) { System.out.print(p+" "); }

    void print(int q)
    {
        //Add your code here.
        System.out.print(q+" ");
    }
}
