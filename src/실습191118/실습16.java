package 실습191118;

import java.util.Scanner;

public class 실습16 {

	public static void main(String[] args) {
		
		int[][] 맵 = {
				{0,0,0,0,0,0,0,0,0,0},
				{1,0,1,0,1,1,1,0,1,1},
				{1,0,1,0,1,1,1,0,1,1},
				{1,0,1,0,1,0,1,0,1,0},
				{1,1,1,0,2,0,1,0,1,0},
				{1,1,1,0,1,0,1,0,1,0},
				{1,0,1,0,1,0,1,0,1,0},
				{1,0,1,1,1,0,1,1,1,0},
				{1,0,1,1,1,0,1,1,1,0},
				{0,0,0,0,0,0,0,0,0,0}
		};

		Scanner scan = new Scanner(System.in);
		int temp;
		while(true) {
			
			for(int i = 0; i < 맵.length; i++) {
				for(int j = 0; j < 맵[i].length; j++) {
					
					System.out.print(맵[i][j]);			
				}
				System.out.println("");
			}
			System.out.println("");
			
			String 이동 = scan.next();
		
			switch (이동) {
				case "1": // 위쪽
					
					for(int i=0; i<10; i++) {
						for(int j=0; j<10; j++) {
							if(맵[i][j]==2 && 맵[i-1][j]!=0) {
								temp=맵[i-1][j];
								맵[i-1][j]=맵[i][j];
								맵[i][j]=temp;
								System.out.println("위쪽 이동!");
								}
							
							else if(맵[i][j]==2 &&맵[i-1][j]==0){
								System.out.println("벽입니다 다시입력하세요");
							}
							}
						}
					break;
					
				case "2": // 오른쪽
					System.out.println("오른쪽 이동!");
					break;
				case "3": // 아래쪽
					System.out.println("아래쪽 이동!");
					break;
				case "4": // 왼쪽
					System.out.println("왼쪽 이동!");
					break;
				default:
					System.out.println("다시 입력하세요.");
					break;
			}
	
			
			
			
			}
		}
}

		

