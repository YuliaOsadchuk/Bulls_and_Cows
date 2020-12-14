import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int scale = x1 * x2 + y1 * y2;
        double modFirst = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double modSecond = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
        double angle = scale / (modFirst * modSecond);
        System.out.println(Math.toDegrees(Math.acos(angle)));
    }
}