import java.util.Scanner;

public class Uri3303 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String palavra = sc.next();
		
		if(palavra.length() >= 10) {
			System.out.println("palavrao");
		}
		
		else {
			System.out.println("palavrinha");
		}
		sc.close();

	}

}
