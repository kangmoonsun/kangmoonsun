package january30;

import java.util.Scanner;

public class Baekjoon8393 {
	
	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for(int i=0; i<=number; i++) {
			n +=i;
			//�ڱ� �ڽ��� ���Ѵ�
		}
		System.out.println(n);
	}
}
