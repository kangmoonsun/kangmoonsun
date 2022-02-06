package february07;

import java.util.Scanner;

public class Baekjoon2562 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[9];
		int count = 0; 
		int h = 0;  // ÃÖ´ñ°ª index¸¦ ³ªÅ¸³¿
		int first = arr[0];
		
		for(int i : arr) {
			int b = scanner.nextInt();
			arr[i] = b;
			count++;
			
			if(arr[i]>first) {
				first = arr[i];
				h = count ;
				
			}
		}
		System.out.println(first);
		System.out.println(h);
		
	}
}
