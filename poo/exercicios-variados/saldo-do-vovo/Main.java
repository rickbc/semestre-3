import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int S = scanner.nextInt();

        int minSaldo = S;
        for (int i = 0; i < N; i++) {
            int movimentacao = scanner.nextInt();
            S += movimentacao;
            if (S < minSaldo) {
                minSaldo = S;
            }
        }

        System.out.println(minSaldo);
    }
}
