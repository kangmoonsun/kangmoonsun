import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번>>");
		int num = scan.nextInt();
		
		System.out.print("이름>>");
		String name = scan.next();
		
		System.out.print("키>>");
		float height = scan.nextFloat();
		
		System.out.print("16진수>>");
		int hexa = scan.nextInt(16);
		
		System.out.println("학번 : " + num);
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.printf("16진수 : %x , 10진수 : %d  \n", hexa, hexa);
	}

}
