import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern p = Pattern.compile("\\bprogram[a-z]*\\b", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
    }
}