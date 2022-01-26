package january20;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
			Scanner a = new Scanner(System.in);
			int A = a.nextInt();
			int B = a.nextInt();
			
			System.out.println(A*(B%10));
			System.out.println(A*((B%100)/10));
			System.out.println(A*(B/100));
			System.out.println(A*B);


	}
}


	
