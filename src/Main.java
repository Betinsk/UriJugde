import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		int idade = sc.nextInt();
		
		String nome1 = sc.next();
		int idade1 = sc.nextInt();
		
		double media = (double) (idade + idade1) / 2;
		
		System.out.printf("A idade m�dia de %s e %s � de %.1f anos", nome, nome1, media);

		sc.close();
	}

}
