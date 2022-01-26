package january21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if(B<45) {
			if (A==0) {
				System.out.println("23" + " " + (B+15));
				} else
					System.out.println((A-1)+ " " + (B+15));
				} 
				else if (B>45) {
					System.out.println(A + " " + (B-45));
				}
				else if (B==45) {
					System.out.println(A + " " + "0");
				}
	}
}
