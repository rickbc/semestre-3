import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] N = new int[20];
        int a = 0;

        while (scanner.hasNextInt()) {
            N[a] = scanner.nextInt();
            a++;
        }

        a = 0;
        for (int i = 19; i >= 10; i--) {
            int aux = N[i];
            N[i] = N[a];
            N[a] = aux;
            a++;
        }

        for (int j = 0; j < 20; j++) {
            System.out.println("N[" + j + "] = " + N[j]);
        }
    }
}