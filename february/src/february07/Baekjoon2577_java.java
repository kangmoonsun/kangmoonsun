package february07;

import java.util.Scanner;

public class Baekjoon2577_java {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = (scanner.nextInt()*scanner.nextInt()*scanner.nextInt());
		String str = Integer.toString(a);		
		
		for(int j = 0 ; j < 10 ; j++) {
			int count = 0;
			for(int i = 0 ; i < str.length(); i++){ //문자열 길이만큼 검사
				if(((str.charAt(i)-'0'))==j){ // charAt()쓸 경우 - '0' or -48
					count++;
				}
			}
			System.out.println(count);
		}
		// 문제 나중에 다시 볼 것
	}

}
