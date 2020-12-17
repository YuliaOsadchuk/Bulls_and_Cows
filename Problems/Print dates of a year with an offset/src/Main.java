import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.parse(scanner.next());
        int days = scanner.nextInt();
        int year = date.getYear();
        System.out.println(date);
        for (int i = 0; i < days; i++) {
            date = date.plusDays(days);
            if (date.getYear() == year) {
                System.out.println(date);
            } else {
                break;
            }
        }

    }
}