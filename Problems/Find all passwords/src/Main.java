import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern p = Pattern.compile("\\bpassword:?(.+?\\S)\\b", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        boolean find = false;
        while (m.find()) {
            /*Pattern pp = Pattern.compile("password:?", Pattern.CASE_INSENSITIVE);

            String s = m.group().replaceAll("password:?".toLowerCase(), "");*/
            System.out.println(m.group(1).trim());
            find = true;
        }
        if (!find) {
            System.out.println("No passwords found.");
        }
    }
}