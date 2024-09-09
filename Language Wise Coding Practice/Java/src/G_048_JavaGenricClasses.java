public class G_048_JavaGenricClasses {
    public static void main(String[] args) {

    }
}

class GenericClass<T> {

    //Add your code here. Make a private data variable, constructor which intialize
    // the data variable and a method showType().
    private T value;
    private String type;

    public GenericClass(T data) {
        this.value = data;
        this.type = data.getClass().getSimpleName();
    }

    void showType() {
        System.out.println(this.type + "\n" + this.value);
    }

}

