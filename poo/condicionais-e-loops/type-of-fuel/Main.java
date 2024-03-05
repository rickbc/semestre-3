import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, x = 0, y = 0, z = 0;

        while (true) {
            a = scanner.nextInt();
            if (a == 4)
                break;
            else {
                if (a == 1) x++;
                else if (a == 2) y++;
                else if (a == 3) z++;
                else continue;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + x);
        System.out.println("Gasolina: " + y);
        System.out.println("Diesel: " + z);
    }
}