package january31;

import java.util.Scanner;

public class Baekjoon11022 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			
			
			for(int i=1; i<=number;i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				
				System.out.println("Case #"+i+": "+ a +" + "+ b +" = " +(a+b));	
			}
			
			
		}
	}