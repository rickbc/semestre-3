import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        for (int i = 0; i < C; i++) {
            String rajesh = scanner.next();
            String sheldon = scanner.next();
            if (rajesh.equals(sheldon)) {
                System.out.println("empate");
            } else if ((rajesh.equals("tesoura") && (sheldon.equals("papel") || sheldon.equals("lagarto"))) ||
                       (rajesh.equals("papel") && (sheldon.equals("pedra") || sheldon.equals("spock"))) ||
                       (rajesh.equals("pedra") && (sheldon.equals("lagarto") || sheldon.equals("tesoura"))) ||
                       (rajesh.equals("lagarto") && (sheldon.equals("spock") || sheldon.equals("papel"))) ||
                       (rajesh.equals("spock") && (sheldon.equals("tesoura") || sheldon.equals("pedra")))) {
                System.out.println("rajesh");
            } else {
                System.out.println("sheldon");
            }
        }
        scanner.close();
    }
}