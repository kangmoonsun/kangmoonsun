import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�й�>>");
		int num = scan.nextInt();
		
		System.out.print("�̸�>>");
		String name = scan.next();
		
		System.out.print("Ű>>");
		float height = scan.nextFloat();
		
		System.out.print("16����>>");
		int hexa = scan.nextInt(16);
		
		System.out.println("�й� : " + num);
		System.out.println("�̸� : " + name);
		System.out.println("Ű : " + height);
		System.out.printf("16���� : %x , 10���� : %d  \n", hexa, hexa);
	}

}
