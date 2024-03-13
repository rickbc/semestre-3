import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorCompra = scanner.nextInt();
        int numeroParcelas = scanner.nextInt();

        int valorParcela = valorCompra / numeroParcelas;
        int restoDivisao = valorCompra % numeroParcelas;

        for (int i = 0; i < numeroParcelas; i++) {
            if (i < restoDivisao) {
                System.out.println(valorParcela + 1);
            } else {
                System.out.println(valorParcela);
            }
        }

        scanner.close();
    }
}