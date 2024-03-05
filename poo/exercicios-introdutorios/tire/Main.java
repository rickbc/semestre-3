import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int desiredPressure = sc.nextInt();
        int currentPressure = sc.nextInt();
        int difference = desiredPressure - currentPressure;

        System.out.println(difference);
    }
}