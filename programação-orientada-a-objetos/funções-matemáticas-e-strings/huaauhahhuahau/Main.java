import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String risada = sc.next();
		String lol = "";
		
		for(int i=0 ; i<risada.length() ; i++){
			if (risada.charAt(i) == 'a' || risada.charAt(i) == 'e' || risada.charAt(i) == 'i' || risada.charAt(i) == 'o' || risada.charAt(i) == 'u'){
				lol = lol + risada.charAt(i);
			}
		}
		
		String relol = new StringBuilder(lol).reverse().toString();
		
		if (lol.equals(relol)) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
	}

}