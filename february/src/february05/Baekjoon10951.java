package february05;

import java.util.Scanner;

public class Baekjoon10951 {


		public static void main(String[] args) {
			Scanner abc = new Scanner(System.in);
			
			while(abc.hasNextInt()) {
				int b = abc.nextInt();
				int c = abc.nextInt();
				System.out.println(b+c);
			}
		}
}

