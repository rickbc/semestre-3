import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int n = 0; n < N; n++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int r = (3 * x) * (3 * x) + y * y;
            int b = 2 * (x * x) + (5 * y) * (5 * y);
            int c = -100 * x + y * y * y;
            if (r > b && r > c) {
                System.out.println("Rafael ganhou");
            } else if (b > r && b > c) {
                System.out.println("Beto ganhou");
            } else {
                System.out.println("Carlos ganhou");
            }
        }
    }
}