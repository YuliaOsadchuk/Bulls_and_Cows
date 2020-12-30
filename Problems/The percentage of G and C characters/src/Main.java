import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        str = str.toLowerCase();
        int cg = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g' || str.charAt(i) == 'c') {
                cg++;
            }
        }
        double result = (double) cg / str.length() * 100;
        System.out.println(result);
    }
}