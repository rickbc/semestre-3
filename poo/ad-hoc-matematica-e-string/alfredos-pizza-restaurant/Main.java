import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pizzaNumber = 1;
        while (true) {
            int R = scanner.nextInt();
            if (R == 0) break;
            int W = scanner.nextInt();
            int L = scanner.nextInt();
            double diameter = 2 * R;
            double diagonal = Math.sqrt(W * W + L * L);
            if (diameter >= diagonal) {
                System.out.println("Pizza " + pizzaNumber + " fits on the table.");
            } else {
                System.out.println("Pizza " + pizzaNumber + " does not fit on the table.");
            }
            pizzaNumber++;
        }
    }
}