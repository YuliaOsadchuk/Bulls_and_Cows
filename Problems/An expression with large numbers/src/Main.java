import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger i1 = new BigInteger(scanner.next());
        BigInteger i2 = new BigInteger(scanner.next());
        BigInteger i3 = new BigInteger(scanner.next());
        BigInteger i4 = new BigInteger(scanner.next());

        BigInteger result = i1.negate().multiply(i2).add(i3).subtract(i4);
        System.out.println(result);
    }
}