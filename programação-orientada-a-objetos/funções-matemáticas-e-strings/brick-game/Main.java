import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt();
            int[] ages = new int[N];
            for (int i = 0; i < N; i++) {
                ages[i] = scanner.nextInt();
            }
            System.out.printf("Case %d: %d\n", t, ages[N / 2]);
        }
    }
}