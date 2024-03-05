import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maxab = ((a + b + Math.abs(a - b)) / 2);
        int max = ((maxab + c + Math.abs(maxab - c)) / 2);

        System.out.printf("%d eh o maior\n", max);
    }
}