import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] portions = {300, 1500, 600, 1000, 150};
        int total = 225;

        for (int i = 0; i < portions.length; i++) {
            int servings = sc.nextInt();
            total += servings * portions[i];
        }

        System.out.println(total);
    }
}