import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double x = (1 + Math.sqrt(5)) / 2.0;
        double y = (1 - Math.sqrt(5)) / 2.0;
        double ans = (Math.pow(x, n) - Math.pow(y, n)) / Math.sqrt(5);
        System.out.printf("%.1f\n", ans);
        scanner.close();
    }
}