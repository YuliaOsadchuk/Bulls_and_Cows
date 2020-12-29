import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < s1.length; i++) {
            if (max < s1[i].length()) {
                max = s1[i].length();
                maxIndex = i;
            }
        }
        System.out.println(s1[maxIndex]);
    }
}