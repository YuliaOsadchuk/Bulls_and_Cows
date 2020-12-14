import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        BigInteger result = new BigInteger(String.valueOf(n));
        if (n == 0) {
            return BigInteger.ONE;
        }
        for (int i = n - 2; i > 0; i -= 2) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    /*public static void main(String[] args) {
        System.out.println(calcDoubleFactorial(7));
    }*/
}

