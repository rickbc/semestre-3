import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < C; i++) {
            String message = scanner.nextLine();
            StringBuilder hiddenText = new StringBuilder();
            for (int j = message.length() - 1; j >= 0; j--) {
                char c = message.charAt(j);
                if (Character.isLowerCase(c)) {
                    hiddenText.append(c);
                }
            }
            System.out.println(hiddenText);
        }
        scanner.close();
    }
}