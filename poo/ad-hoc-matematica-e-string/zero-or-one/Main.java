import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int alice = scanner.nextInt();
            int bob = scanner.nextInt();
            int clara = scanner.nextInt();

            char winner = determineWinner(alice, bob, clara);
            System.out.println(winner);
        }

        scanner.close();
    }

    private static char determineWinner(int alice, int bob, int clara) {
       
        if (alice == bob && bob == clara) {
            return '*';
        }

        
        if (alice != bob && alice != clara) {
            return 'A';
        } else if (bob != alice && bob != clara) {
            return 'B';
        } else {
            return 'C';
        }
    }
}
