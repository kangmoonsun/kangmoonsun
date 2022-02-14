package february14;

import java.util.Scanner;

public class Baekjoon2525_java {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		int T = (b+c)/60 ;
		int J = (b+c)%60;
		
		if((a+T) >= 24) {
			a = a+T-24;
			System.out.print(a+ " " + J);
		}
		else {
			a=a+T;
			System.out.println(a+ " " + J);
		}
	}

}
