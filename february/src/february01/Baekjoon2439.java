package february01;

import java.util.Scanner;

public class Baekjoon2439 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for(int i = 1; i<=number; i++) {
			for(int j = 1 ; j<=(number-i) ; j++) {
				System.out.print(" ");
				}
				for(int a = 1 ; a <= i; a++) {
					System.out.print("*");
				}
			System.out.println();
		}
	}

}
