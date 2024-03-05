import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int z = scanner.nextInt();
            while (z <= x) {
                z = scanner.nextInt();
            }
            int sum = 0;
            for (int i = 1; true; i++) {
                sum += x;
                x++;
                if (sum > z) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }