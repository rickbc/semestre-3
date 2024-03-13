import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int R = scanner.nextInt();
            boolean[] returned = new boolean[N];
            for (int i = 0; i < R; i++) {
                int volunteer = scanner.nextInt();
                returned[volunteer - 1] = true;
            }
            boolean allReturned = true;
            for (int i = 0; i < N; i++) {
                if (!returned[i]) {
                    System.out.print((i + 1) + " ");
                    allReturned = false;
                }
            }
            if (allReturned) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}