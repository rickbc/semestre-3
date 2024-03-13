import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            String word = scanner.next();
            if (word.length() == 3) {
                int count = 0;
                if (word.charAt(0) == 'o') count++;
                if (word.charAt(1) == 'n') count++;
                if (word.charAt(2) == 'e') count++;
                if (count >= 2) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else {
                System.out.println(3);
            }
        }
        scanner.close();
    }
}