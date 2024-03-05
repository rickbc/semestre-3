import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String line = scanner.next();
            int sum = 0;
            StringBuilder number = new StringBuilder();
            for (char c : line.toCharArray()) {
                if (Character.isDigit(c)) {
                    number.append(c);
                } else if (!number.isEmpty()) {
                    sum += Integer.parseInt(number.toString());
                    number.setLength(0);
                }
            }

            if (!number.isEmpty()) {
                sum += Integer.parseInt(number.toString());
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
