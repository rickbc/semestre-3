import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int N = scanner.nextInt();
            if (N == 0) break;
            for (int i = 0; i < N; i++) {
                int count = 0;
                int answer = 0;
                for (int j = 0; j < 5; j++) {
                    int grayLevel = scanner.nextInt();
                    if (grayLevel <= 127) {
                        count++;
                        answer = j;
                    }
                }
                if (count == 1) {
                    System.out.println((char) ('A' + answer));
                } else {
                    System.out.println("*");
                }
            }
        }
        scanner.close();
    }
}