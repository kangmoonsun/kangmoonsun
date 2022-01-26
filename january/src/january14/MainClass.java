package january14;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		int a_position = 5;
		int[] a_road = {11, 14, 15, 2, 3,
				7, 8, 1, 5, 6};
		
	
		int b_position = 5;
		int[] b_road = {11, 14, 15, 2, 3,
				7, 8, 1, 5, 6};
		
		
		char[][] problem_front = {
				{'a', 'b', 'c', 'd'},
				{'e','f','g','h'},
				{'i','j','k','l'},
				{'m','n','o','p'}
		};
		
		int[][] problem_back = {
				{1, 2,3, 4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		
		String a_turn = "a�� �����Դϴ�.\n"
				+ "���� ��ġ�� " + a_position + "�Դϴ�.\n"
				+ "a_road �� �Ʒ��� �����ϴ�.\n";
		String b_turn = "b�� �����Դϴ�.\n"
				+ "���� ��ġ�� " + b_position + "�Դϴ�.\n"
				+ "b_road �� �Ʒ��� �����ϴ�.\n";
		
		String correct = "�����Դϴ�. ��ĭ ����. \n";
		String incorrect = "�����Դϴ�. ��ĭ ����. \n";
		
		
		char choice;
	    
		
		Scanner sc = new Scanner(System.in);
		int t = 0;
		for(;;) {
			// start �� ��Ȳ
			if (t % 2 == 0) {
				System.out.println(a_turn);	
				
				for (int i =0; i < 10; i++) {
					System.out.print(i+1 + " ");	
				}
				System.out.println();
                for (int i =0; i < 10; i++) {
                	System.out.print(a_road[i] + " ");		
				}
                System.out.println();
			} else {
				System.out.println(b_turn);	
				for (int i =0; i < 10; i++) {
					System.out.print(i+1 + " ");	
				}
				System.out.println();
                for (int i =0; i < 10; i++) {
                	System.out.print(b_road[i] + " ");		
				}
                System.out.println();
			}
			
			System.out.println();
			// ���� ��Ȳ ����
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print(problem_front[i][j] + " ");	
				}
				System.out.print("\n");
			}
			
			System.out.println("���ĺ��� �Է����ּ���");
			
			// �Էº�
			String temp = sc.next();
			if (temp.length() >= 2 || temp.length() <= 0) {
				System.out.println("���ĺ��� �ϳ��� �Է����ּ���.\n");
				continue;
			}
			
			choice = temp.toCharArray()[0];
			
			// ���� ó�� 
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (problem_front[i][j] == choice) {
						System.out.println("�����Ͻ� ���ĺ��� �� ���ڰ��� " + problem_back[i][j]+ "�Դϴ�.\n");
						
						if (t % 2 == 0) {
							if (problem_back[i][j] == a_road[a_position]) {
								System.out.println(correct);
								a_position++;
							} else {
								System.out.println(incorrect);
								a_position--;
							}
						} else {
							if (problem_back[i][j] == a_road[a_position]) {
								System.out.println(correct);
								b_position++;
							} else {
								System.out.println(incorrect);
								b_position--;
							}	
						}
					}
				}
			}
			
			// ��������
			if (a_position == 10 || a_position == -1) {
				System.out.println("A�� �¸� or �й��Դϴ�.");
				break;
			}
			
			if (b_position == 10 || b_position == -1) {
				System.out.println("B�� �¸� or �й��Դϴ�.");
				break;
			}
			
			t++;
		}
	}
}
