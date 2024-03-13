import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count2 = 0, count3 = 0, count4 = 0, count5 = 0;
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            if (number % 2 == 0) count2++;
            if (number % 3 == 0) count3++;
            if (number % 4 == 0) count4++;
            if (number % 5 == 0) count5++;
        }
        System.out.println(count2 + " Multiplo(s) de 2");
        System.out.println(count3 + " Multiplo(s) de 3");
        System.out.println(count4 + " Multiplo(s) de 4");
        System.out.println(count5 + " Multiplo(s) de 5");
        scanner.close();
    }
}