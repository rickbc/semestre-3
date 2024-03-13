import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            String encoded = scanner.next();
            int shift = scanner.nextInt();
            StringBuilder decoded = new StringBuilder();
            for (char c : encoded.toCharArray()) {
                char decodedChar = (char) (c - shift);
                if (decodedChar < 'A') {
                    decodedChar += 26;
                }
                decoded.append(decodedChar);
            }
            System.out.println(decoded.toString());
        }
    }
}