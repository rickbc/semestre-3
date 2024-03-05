import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 3 && words[i].substring(0, 2).equals(words[i].substring(2, 4))) {
                words[i] = words[i].substring(2);
            }
        }
        System.out.println(String.join(" ", words));
    }
}