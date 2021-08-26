import java.util.Locale;
import java.util.Scanner;

public class Uri1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		for(int i= 0;i<6;i++) {
			double x = sc.nextDouble();
			if(x > 0) {
				count ++;
			}
		}
		
		
		System.out.println(count + " valores positivos");
		
		
		sc.close();

	}

}
