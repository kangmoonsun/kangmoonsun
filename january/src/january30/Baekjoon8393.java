package january30;

import java.util.Scanner;

public class Baekjoon8393 {
	
	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for(int i=0; i<=number; i++) {
			n +=i;
			//자기 자신을 더한다
		}
		System.out.println(n);
	}
}
