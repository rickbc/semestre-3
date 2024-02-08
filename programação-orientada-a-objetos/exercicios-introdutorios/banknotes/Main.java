import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int originalValue = value;
        int[] notes = {100, 50, 20, 10, 5, 2, 1};
        int[] noteCounter = new int[7];

        for (int i = 0; i < 7; i++) {
            noteCounter[i] = value / notes[i];
            value %= notes[i];
        }

        System.out.println(originalValue);
        System.out.println(noteCounter[0] + " nota(s) de R$ 100,00");
        System.out.println(noteCounter[1] + " nota(s) de R$ 50,00");
        System.out.println(noteCounter[2] + " nota(s) de R$ 20,00");
        System.out.println(noteCounter[3] + " nota(s) de R$ 10,00");
        System.out.println(noteCounter[4] + " nota(s) de R$ 5,00");
        System.out.println(noteCounter[5] + " nota(s) de R$ 2,00");
        System.out.println(noteCounter[6] + " nota(s) de R$ 1,00");
    }
}