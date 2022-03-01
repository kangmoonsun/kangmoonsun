package february22;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon10757_java {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BigInteger a = scanner.nextBigInteger();
		BigInteger b = scanner.nextBigInteger();
		
		System.out.println(a.add(b));
		//long 범위를 벗어나기에 클래스중 BigInteger를 사용한다.
	}
}
