package january21;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int[] arr = new int[a];
			
			for(int i = 0; i<a; i++) {
				int b = scanner.nextInt();
				int c = scanner.nextInt();
				arr[i]=b+c;
				
			}
			scanner.close();
			
			
			for(int d : arr) {
				System.out.println(arr[d]);
			}
	}

}
