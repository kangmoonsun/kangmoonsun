package february03;

import java.util.Scanner;

public class Baekjoon10952 {

	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		
		while(true) {
			int b = abc.nextInt();
			int c = abc.nextInt();
			if(b==0&&c==0) {
				break;
			}
			System.out.println(b+c);
		}
	}

}
