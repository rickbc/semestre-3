import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean first = true;
        while (true) {
            int N = scanner.nextInt();
            scanner.nextLine();
            if (N == 0) break;
            if (!first) System.out.println();
            first = false;
            String[] lines = new String[N];
            int max = 0;
            for (int i = 0; i < N; i++) {
                lines[i] = scanner.nextLine().trim().replaceAll("\\s+", " ");
                max = Math.max(max, lines[i].length());
            }
            for (String line : lines) {
                for (int i = 0; i < max - line.length(); i++) {
                    System.out.print(" ");
                }
                System.out.println(line);
            }
        }
    }
}