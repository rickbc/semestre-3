import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = scanner.nextInt();
            if (x == 0) break;

            int sum = 0;

            if (x % 2 == 0) sum += x;
            else sum += ++x;

            for (int i = 0; i < 4; i++) {
                x += 2;
                sum += x;
            }
            System.out.println(sum);
        }
    }
}