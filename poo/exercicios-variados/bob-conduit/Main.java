import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int a = 1; a <= T; a++) {
            int R1 = scanner.nextInt();
            int R2 = scanner.nextInt();
            int b = R1 + R2;
            System.out.println(b);
        }
        scanner.close();
    }
}