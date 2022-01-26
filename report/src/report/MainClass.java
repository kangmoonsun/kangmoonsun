package report;

public class MainClass {

	public static void main(String[] args) {
		
		ObjectClass obj1 = new ObjectClass(10,20);
		obj1.getInfo();
		
		ObjectClass obj2 = new ObjectClass(30);
		
		obj1.getInfo(); //static ±¸Çö
	}

}
