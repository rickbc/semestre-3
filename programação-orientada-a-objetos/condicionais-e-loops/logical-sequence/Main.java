import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int b = 1; b <= a; b++) {
            int c = b * b;
            int d = b * b * b;
            System.out.printf("%d %d %d\n", b, c, d);
            int e = c + 1;
            int f = d + 1;
            System.out.printf("%d %d %d\n", b, e, f);
        }
    }
}