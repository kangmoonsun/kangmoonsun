import java.util.Scanner;

public class A202006008 {

	public static void main(String[] args) {
		int radius;
		double area;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학번입력>>");
		String number = scan.next();
		
		System.out.print("이름입력>>");
		String name = scan.next();
		
		System.out.print("반지름입력>>");
		radius = scan.nextInt();
		
		System.out.print("원주율입력>>");
		final double PI = scan.nextDouble();
		
		area = radius * radius * PI;
		
		System.out.println("========================");
		System.out.println("이름:" + name);
		System.out.println("학번 이름은: " + number + " 입니다");
		System.out.println("반지름: " + radius);
		System.out.println("원의 넓이는: " + area + " 입니다");
	}

}
