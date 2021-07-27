import java.util.Locale;
import java.util.Scanner;

public class Uri1064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cont = 0;
		double contP = 0;
		
		for(int i =0;i<6;i ++) {
			double x = sc.nextDouble();
			
			if (x > 0) {
				cont ++;
				contP += x;
			}		
		}
		
		System.out.printf("%.0f valores positivos%n", cont );
		System.out.printf("%.1f%n", contP / cont);
		
		
		sc.close();

	}

}
