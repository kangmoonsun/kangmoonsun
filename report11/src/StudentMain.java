class Student{
	public String name;
	private int age;
	private int num;
	
	public Student() {	
	}
	
	public Student(String n) {
		this.name = n;
	}
	
	public Student(String name, int num) {
		this(name);
		this.num = num;
	}
	
	public Student(String name, int num, int age) {
		this(name,num);
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getNum() {
		return num;
	}
}
	
public class StudentMain {
	public static void main(String[] args) {
		Student std1 = new Student();
		std1.name = "유재석";
		Student std2 = new Student("박나래");
		Student std3 = new Student("강호동",112233);
		Student std4 = new Student("신동엽",12345,50);
		
		System.out.println("이름:"+std1.name);
		System.out.println("이름:"+std2.name);
		System.out.println("이름:"+std3.name+" "+"주민번호"+std3.getNum());
		System.out.println("이름:"+std4.name+" "+"주민번호"+std4.getNum()+" "+"나이"+std4.getAge());
	}
}