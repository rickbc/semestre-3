import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str1 = new String[n];
        String str;
        char c;
        int I = 0, J = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            c = scanner.next().charAt(0);
            str = scanner.next();
            if (c == '+')
                I++;
            else
                J++;
            str1[count++] = str;
        }
        Arrays.sort(str1, 0, count);
        for (int i = 0; i < count; i++)
            System.out.println(str1[i]);
        System.out.printf("Se comportaram: %d | Nao se comportaram: %d\n", I, J);
        scanner.close();
    }
}