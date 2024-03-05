import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] v = {a, b, c};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (v[i] < v[j]) {
                    int aux = v[j];
                    v[j] = v[i];
                    v[i] = aux;
                }
            }
        }

        System.out.printf("%d\n%d\n%d\n\n%d\n%d\n%d\n", v[0], v[1], v[2], a, b, c);
    }
}