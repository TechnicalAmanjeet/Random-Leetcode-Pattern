public class G_003_PreciseFormat {
    public static void main(String[] args) {

    }
}

class Geeks_G_003_PreciseFormat {

    static void printInFormat(float a, float b){
        float result = a/b;

        System.out.println(result + " ");
        System.out.format("%.3f", result);
    }

}
