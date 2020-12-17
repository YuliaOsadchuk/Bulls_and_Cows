import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate date = LocalDate.ofYearDay(year, day);

        int dayPastMonth = 0;
        LocalDate newDate = date.minusMonths(date.getMonthValue());
        for (int i = 1; i <= date.getMonthValue(); i++) {
            /*LocalDate newDate = date.minusMonths(i);
            dayPastMonth += date.minusMonths(i).getDayOfMonth();
            day -= newDate.getDayOfMonth();*/
            newDate = newDate.plusMonths(1);
            dayPastMonth += newDate.lengthOfMonth();
        }
        if (dayPastMonth == day) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //System.out.println(dayPastMonth);
    }
}