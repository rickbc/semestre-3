import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            StringBuilder result = new StringBuilder();
            boolean upper = true;
            for (char c : line.toCharArray()) {
                if (c == ' ') {
                    result.append(c);
                } else if (upper) {
                    result.append(Character.toUpperCase(c));
                    upper = false;
                } else {
                    result.append(Character.toLowerCase(c));
                    upper = true;
                }
            }
            System.out.println(result.toString());
        }
    }
}