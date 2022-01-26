package project01;

public class ChildClass {

	public String name;
	public String gender;
	public int age;
	
	public ChildClass() {
		System.out.println("---ChildClass constructor--");
	}
	
	public void setInfo(String a, String b, int c) {
		System.out.println("---setInfo() START--");
		name = a;
		gender = b;
		age = c;
	}
	public void getInfo() {
		System.out.println("---getInfo() START ----");
		
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
	}
	
	public void getInfo(int x) {
		System.out.println("--getInfo ver2");
	}
}
