import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < C; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[2]);
            int participantAnswer = Integer.parseInt(parts[4]);
            int correctAnswer = 0;
            switch (parts[1]) {
                case "+":
                    correctAnswer = a + b;
                    break;
                case "-":
                    correctAnswer = a - b;
                    break;
                case "x":
                    correctAnswer = a * b;
                    break;
            }
            int error = Math.abs(correctAnswer - participantAnswer);
            System.out.print("E");
            for (int j = 0; j < error; j++) {
                System.out.print("r");
            }
            System.out.println("ou!");
        }
        scanner.close();
    }
}