package february05;

import java.util.Scanner;
 
public class Baekjoon1110_java {
 
	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
 
		int a = abc.nextInt();
		abc.close();
        
		int cnt = 0;
		int b = a;
        
		while (true) {
			a = ((a%10)*10 ) + (((a / 10) + (a % 10)) % 10);
			cnt++;
			/* 
		  	T = (N % 10) * 10 
		  	T = ((N/10)+(N%10)%10) �� �ڸ� ���� �տ��� ���� �ڸ���
		 	���� ���ļ�
		 	T = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10)
		*/
 
			if (b == a) {
				break;
			}
		}
		System.out.println(cnt);
	}
}