public class G_027_ArithmaticOperations {
    public static void main(String[] args) {
        Solution_G_027_ArithmaticOperations.FindRoots(-7,-3, -6);
    }
}


class Solution_G_027_ArithmaticOperations
{
    public static double[]  FindRoots(int A, int B, int C)
    {
        // code here
        double sqrtD = Math.sqrt(B*B-4*A*C);
        double x1 = ((double)(((double)(B) * -1) + sqrtD))/(double)(2*A);
        double x2 = ((double)(((double)(B) * -1) - sqrtD))/(double)(2*A);

        if (Double.isNaN(x1) || Double.isNaN(x2) || Double.isNaN(sqrtD)) {
            return new double[]{-1};
        }

        return new double[]{Math.min(x1,x2),Math.max(x1,x2)};
    }
}

