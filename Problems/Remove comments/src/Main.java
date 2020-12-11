import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codeWithComments = scanner.nextLine();

        codeWithComments = codeWithComments.replaceAll("\\/\\*.*?\\*\\/|\\/\\/.+", "");
        System.out.println(codeWithComments);

        int b=0;
        b =b *b;
    }
}