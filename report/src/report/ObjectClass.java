package report;

public class ObjectClass {
	
	int x;
	static int y; 
	
	public ObjectClass() {
		
	}
	
	public ObjectClass(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public ObjectClass(int y) {
		this.y += y;
	}
	public void getInfo() {
		System.out.println("x ---->" + x);
		System.out.println("y ---->" + y);

	}
}
