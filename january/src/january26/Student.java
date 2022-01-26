package january26;

public class Student {

		int grade;
		int money;
		String studentName;
		
		public Student(String name, int money) {
			this.studentName = name;
			this.money = money;
		}
		
		public void takeBus(Bus bus){
			bus.take(1000);
			this.money -= 1000;
		}
		
		public void takeSubway(Subway subway) {
			subway.take(1200);
			this.money -= 1200;
		}
		
		public void showinfo() {
			System.out.println(studentName +"님의 남은 돈은 " + money +"원 입니다");
		}
		
		
}
