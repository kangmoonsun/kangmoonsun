package week10;

public class ChildClass extends ParentClass {

	private int a = 10;
	
	public ChildClass() {
		System.out.println("ChildClass");
	}
	
	public ChildClass(int b) {
		this.a = b;
		System.out.println("ChildClass");
		
	}
	
	public void setInfo() {
		System.out.println("ChildFun" + a);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}
