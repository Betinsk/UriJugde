import java.util.Scanner;

public class Uri1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
			
		int cont = 0;
		
		while(cont < 6) {
			if(x %2 ==1) {
				System.out.println(x);
				cont ++;
			}
			x++;
		}
		
		
		
		
		
	/*	for(int i =0; i<6; i++) {
			
			if(x %2==0) {
				x += 2;
				System.out.println(x -1);
			}
			else {
				x++;
				System.out.println(x -1);
			}
	
			}

		sc.close();
*/
	}

}
