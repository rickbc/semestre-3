import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        int N = sc.nextInt();

        int endPoint = C % N;

        System.out.println(endPoint);
    }
}