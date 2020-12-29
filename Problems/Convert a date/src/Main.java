import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] s = date.split("-");
        System.out.println(s[1] + "/" + s[2] + "/" + s[0]);
    }
}