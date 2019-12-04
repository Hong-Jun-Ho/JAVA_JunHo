package 실습191118;

import java.util.Scanner;

public class 맵찾기_혼자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] 맵 = { 
				{ 0, 0, 0, 0, 1, 0, 1, 0, 1, 0 }, 
				{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
				{ 1, 0, 1, 1, 1, 0, 1, 0, 1, 0 }, 
				{ 2, 0, 1, 1, 1, 0, 1, 0, 1, 0 }, 
				{ 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 },
				{ 1, 0, 1, 0, 1, 1, 1, 1, 1, 0 }, 
				{ 1, 0, 1, 0, 1, 1, 1, 1, 1, 0 }, 
				{ 1, 1, 1, 0, 1, 0, 1, 0, 1, 0 },
				{ 1, 1, 1, 0, 1, 0, 1, 0, 1, 1 }, 
				{ 0, 0, 0, 0, 0, 0, 1, 0, 1, 1 } };

		int x = 3;
		int y = 0;

		Scanner scan = new Scanner(System.in);

		while (맵[x][y]!=9) {
			System.out.println("");
			System.out.println("-------------- M A P ---------------");
			for (int i = 0; i < 맵.length; i++) {
				for (int j = 0; j < 맵[i].length; j++) {
					System.out.print(맵[i][j]);
				}
				System.out.println("");
			}
			System.out.println("================================");
			System.out.println("아래에 방향키를 입력하세요: ");

			switch (scan.nextInt()) {

			case 8: // 위로
				if (맵[x - 1][y] > 0) {
					if (맵[x - 1][y] == 1) {
						맵[x - 1][y] = 2;
						맵[x][y] = 1;
						x--;
					} 
				}else {
					System.out.println("길이 아닙니다. 다시입력하세요: ");
				}

				break;

			case 4: // 왼쪽으로 1칸 이동
				if (y!=0) {
					if (맵[x][y-1] == 1) {
						맵[x][y-1] = 2;
						맵[x][y] = 1;
						y--;
					} 
				}else {
					System.out.println("길이 아닙니다. 다시입력하세요: ");
				}
				break;

			case 6: // 오른쪽으로 1칸 이동
				if (y!=9) {
					if (맵[x][y+1] == 1) {
						맵[x][y+1] = 2;
						맵[x][y] = 1;
						y++;
					} 
				}else {
					System.out.println("탈출 성공!! ");
					for (int i = 0; i < 맵.length; i++) {
						for (int j = 0; j < 맵[i].length; j++) {
							맵[i][j]=9;
						}
					}
					break;
				}
				break;

			case 5: // 아래로 1칸 이동
				if (맵[x + 1][y] > 0) {
					if (맵[x + 1][y] == 1) {
						맵[x + 1][y] = 2;
						맵[x][y] = 1;
						x++;
					} 
				}else {
					System.out.println("길이 아닙니다. 다시입력하세요: ");
				}
				break;

			case 0:
				System.out.println("게임을 종료합니다.");
				for (int i = 0; i < 맵.length; i++) {
					for (int j = 0; j < 맵[i].length; j++) {
						맵[i][j]=9;
					}
				}
				
				break;

			default:
				System.out.println("다시 입력하세요 ");
				continue;
			} // 방향키 입력

		}

	}

}
