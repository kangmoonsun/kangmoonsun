import java.util.Scanner;

public class A202006008 {

	public static void main(String[] args) {
		int radius;
		double area;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�й��Է�>>");
		String number = scan.next();
		
		System.out.print("�̸��Է�>>");
		String name = scan.next();
		
		System.out.print("�������Է�>>");
		radius = scan.nextInt();
		
		System.out.print("�������Է�>>");
		final double PI = scan.nextDouble();
		
		area = radius * radius * PI;
		
		System.out.println("========================");
		System.out.println("�̸�:" + name);
		System.out.println("�й� �̸���: " + number + " �Դϴ�");
		System.out.println("������: " + radius);
		System.out.println("���� ���̴�: " + area + " �Դϴ�");
	}

}
