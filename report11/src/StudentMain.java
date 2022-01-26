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
		std1.name = "���缮";
		Student std2 = new Student("�ڳ���");
		Student std3 = new Student("��ȣ��",112233);
		Student std4 = new Student("�ŵ���",12345,50);
		
		System.out.println("�̸�:"+std1.name);
		System.out.println("�̸�:"+std2.name);
		System.out.println("�̸�:"+std3.name+" "+"�ֹι�ȣ"+std3.getNum());
		System.out.println("�̸�:"+std4.name+" "+"�ֹι�ȣ"+std4.getNum()+" "+"����"+std4.getAge());
	}
}