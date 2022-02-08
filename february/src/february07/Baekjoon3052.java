package february07;

import java.util.Scanner;

public class Baekjoon3052 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[10];
		int count = 0;
		
		for (int j = 0 ; j < arr.length; j++) {
			int a = scanner.nextInt();
			arr[j]=a;
			if((arr[j]%42)!=0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
