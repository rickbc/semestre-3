import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();

        for (int i = 0; i < C; i++) {
            int N = scanner.nextInt();
            int count = 0;
            for (int j = 2; j <= N; j++) {
                if (isEven(countDivisors(j))) {
                    count++;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == num / i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}