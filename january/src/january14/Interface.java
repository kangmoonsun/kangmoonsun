package january14;

public class Interface implements InterfaceA, InterfaceB {

		public Interface() {
			System.out.println("interface");
		}

		@Override
		public void InterfaceB() {
			System.out.println("B");
			
		}

		@Override
		public void InterfaceA() {
			System.out.println("A");
			
		}
		
		
}
