import java.util.Scanner;

public class Uri1241 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i =0;i<N;i++) {
			String A = sc.next();
			String B = sc.next();
			if(B.length()> A.length()) {
				System.out.println("nao encaixa");
			}
			else {
				String x = A.substring(A.length() - B.length());
			
			if(x.equals(B)) {
				System.out.println("encaixa");
			}
			else {
				System.out.println("nao encaixa");
			}
		}
	}
	
	}

}
