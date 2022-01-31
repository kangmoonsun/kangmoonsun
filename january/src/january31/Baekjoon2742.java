package january31;

import java.util.Scanner;

public class Baekjoon2742 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int b = number;
		
		for(int i=1;i<=b;i++) {
			System.out.println(number);
			number--;
		}
	}

}
