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
		
		
		String a_turn = "a의 차례입니다.\n"
				+ "현재 위치는 " + a_position + "입니다.\n"
				+ "a_road 는 아래와 같습니다.\n";
		String b_turn = "b의 차례입니다.\n"
				+ "현재 위치는 " + b_position + "입니다.\n"
				+ "b_road 는 아래와 같습니다.\n";
		
		String correct = "정답입니다. 한칸 전진. \n";
		String incorrect = "오답입니다. 한칸 후진. \n";
		
		
		char choice;
	    
		
		Scanner sc = new Scanner(System.in);
		int t = 0;
		for(;;) {
			// start 및 현황
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
			// 문제 상황 공개
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print(problem_front[i][j] + " ");	
				}
				System.out.print("\n");
			}
			
			System.out.println("알파벳을 입력해주세요");
			
			// 입력부
			String temp = sc.next();
			if (temp.length() >= 2 || temp.length() <= 0) {
				System.out.println("알파벳을 하나만 입력해주세요.\n");
				continue;
			}
			
			choice = temp.toCharArray()[0];
			
			// 정답 처리 
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (problem_front[i][j] == choice) {
						System.out.println("선택하신 알파벳의 뒤 숫자값은 " + problem_back[i][j]+ "입니다.\n");
						
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
			
			// 종료조건
			if (a_position == 10 || a_position == -1) {
				System.out.println("A의 승리 or 패배입니다.");
				break;
			}
			
			if (b_position == 10 || b_position == -1) {
				System.out.println("B의 승리 or 패배입니다.");
				break;
			}
			
			t++;
		}
	}
}
