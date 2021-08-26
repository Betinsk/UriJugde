import java.util.Scanner;

public class Uri3315 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mat [][] = new int [4][7];
		
		for(int i =0;i<4;i++) {
			for(int j =0;j<7;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int result =0;
		int cont = 0;

		
		
		for(int i =0;i<4;i++) {
			for(int j =0;j<7;j++) {
				result += mat[i][j];
			}
			if(result>cont) {
				cont = result;
			}
			result = 0;
		}
		
		System.out.println(cont+ " = "+ Integer.toBinaryString(cont));
	

		sc.close();

	}

}
