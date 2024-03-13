import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 0; i < x; ++i) {
            int tmp = 0;
            String s = scanner.next();
            int size = s.length();
            for (int j = 0; j < size; ++j) {
                if(s.charAt(j) == '0' || s.charAt(j) == '9' || s.charAt(j) == '6'){
                    tmp += 6;
                }else if(s.charAt(j) == '1'){
                    tmp += 2;
                }else if(s.charAt(j) == '2' || s.charAt(j) == '3' || s.charAt(j) == '5'){
                    tmp += 5;
                }else if(s.charAt(j) == '4'){
                    tmp += 4;
                }else if(s.charAt(j) == '7'){
                    tmp += 3;
                }else{
                    tmp += 7;
                }
            }
            System.out.println(tmp + " leds");
        }
    }
}