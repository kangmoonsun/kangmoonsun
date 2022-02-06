package february07;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10818 {
	
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int arr[] = new int[b];
		
		for(int i = 0 ; i < b ; i++) {
			int c = a.nextInt();
			arr[i] = c;
		}
		Arrays.sort(arr);
		System.out.println(arr[0]+ " " + arr[b-1]);
	}
}
