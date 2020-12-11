import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        Pattern p = Pattern.compile("\\S" + part + "\\S", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(line);
        if (m.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}