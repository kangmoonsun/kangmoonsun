package february14;
import java.util.Scanner;

public class Baekjoon2480_java {

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			if(a==b && a==c) {
				System.out.println(10000+a*1000);
			}
			else if(a==b || a==c ) {
				System.out.println(1000+a*100);
			}
			else if(a!=b && a!=c) {
				System.out.println(Math.max(a, Math.max(c, b))*100);
			}
	}

}
