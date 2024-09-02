public class G_FindTheNthNumber {
    public static void main(String[] args) {
        System.out.println(Solution.get(14));
    }
}

class Solution{
    static long get(long n){
        long num = 0, count = 0;

        while(n > count) {
            ++num;
            count += num;
        }

        if (n == count) return num;
        return n + num - count;
    }
}