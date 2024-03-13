import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        BigInteger twelve = new BigInteger("12");
        BigInteger thousand = new BigInteger("1000");
        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            BigInteger grains = BigInteger.valueOf(2).pow(X).subtract(BigInteger.ONE);
            BigInteger grams = grains.divide(twelve);
            BigInteger kg = grams.divide(thousand);
            System.out.println(kg + " kg");
        }
        scanner.close();
    }
}