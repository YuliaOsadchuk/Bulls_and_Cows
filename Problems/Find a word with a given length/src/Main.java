import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();
        boolean yes = false;
        Pattern p = Pattern.compile("\\s?\\b[a-zA-Z]{" + size + ",}\\b\\s?");
        Matcher m = p.matcher(line);

        if (m.find()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


        /*String[] s = line.split(" ");
        for (String i : s) {
            if (i.length() >= size) {
                yes = true;
                break;
            }
        }

        if (yes) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }*/
    }
}