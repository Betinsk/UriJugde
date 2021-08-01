import java.util.Scanner;

public class Uri1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int par = 0;
		
		while(par !=N) {
			par += 2;
			int x = par * par;
			System.out.println(par + " ^ 2 = "+ x );
		}
		
		
		
		
		
		sc.close();
	}

}
