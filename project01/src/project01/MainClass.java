package project01;

public class MainClass {

	public static void main(String[] args) {
		
		ChildClass mychil1 = new ChildClass();
		mychil1.name = "hong gil dong";
		mychil1.gender = "M";
		mychil1.age = 12;
		
		mychil1.getInfo();
		mychil1.setInfo("song", "W", 4);
		mychil1.getInfo();
		mychil1.getInfo(2);
	}
}
