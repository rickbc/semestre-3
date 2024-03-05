import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int cases = scn.nextInt();

        while (cases-- > 0) {
            String word = scn.next();

            
            if (word.equals("hamekame")) {
                System.out.println("ka");
            } else {
                String out = kameHame(word);
                System.out.println(out);
            }
        }
    }

    static String kameHame(String str) {
        StringBuilder str2 = new StringBuilder();
        int counter = 0;
        int aux;

        
        str2.append('k');
        str = str.substring(1);

        
        while (str.startsWith("a")) {
            str = str.substring(1);
            counter++;
        }

        while (!str.startsWith("a")) {
            str = str.substring(1);
        }

        
        if (counter == 1) {
            while (str.startsWith("a")) {
                str2.append(str.charAt(0));
                str = str.substring(1);
            }
        } else {
            
            while (str.startsWith("a")) {
                aux = counter;
                while (aux-- > 0) {
                    str2.append('a');
                }
                str = str.substring(1);
            }
        }

        return str2.toString();
    }
}