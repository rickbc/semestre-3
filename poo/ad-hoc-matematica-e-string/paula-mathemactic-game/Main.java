import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            String s = scanner.next();
            int a = Character.getNumericValue(s.charAt(0));
            int b = Character.getNumericValue(s.charAt(2));
            char op = s.charAt(1);
            if (a == b) {
                System.out.println(a * b);
            } else if (Character.isUpperCase(op)) {
                System.out.println(b - a);
            } else {
                System.out.println(a + b);
            }
        }
    }
}