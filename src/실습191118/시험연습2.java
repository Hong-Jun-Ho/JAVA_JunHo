package 실습191118;

import java.util.Scanner;

public class 시험연습2 {

	static int[][] 맵 = { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
			{ 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 }, { 1, 1, 1, 0, 2, 0, 1, 0, 1, 0 },
			{ 1, 1, 1, 0, 1, 0, 1, 0, 1, 0 }, { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 }, { 1, 0, 1, 1, 1, 0, 1, 1, 1, 0 },
			{ 1, 0, 1, 1, 1, 0, 1, 1, 1, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

	static int[] 현재위치 = { 4, 4 };

	static void 맵그리기() {
		for (int i = 0; i < 맵.length; i++) {
			for (int j = 0; j < 맵[i].length; j++) {
				System.out.print(맵[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] arg) {
		맵그리기();
		Scanner scan = new Scanner(System.in);

		System.out.println("입력하세요 ");

		while (true) {
			int 상태코드 = 이동(scan.nextInt());
			if (상태코드 == 1) {
				맵그리기();
			} else if (상태코드 == 0) {
				System.out.println("시스템 종료 ");
				break;
			} else {
				System.out.println("다시입력하세요");
			}

		}
		scan.close();
	}

	static int 이동(int input) {
		int 상태코드 = 1;
		int[] 이동위치 = { 현재위치[0], 현재위치[1] };

		switch (input) {

		case 8:// 위로
			if (이동위치[0] > 0)
				이동위치[0] -= 1;
			break;

		case 5:// 아래로
			if (이동위치[0] < 맵.length)
				이동위치[0] += 1;
			break;

		case 6:// 오른쪽
			if (이동위치[1] < 맵[0].length - 1)
				이동위치[1] += 1;
			break;

		case 4:// 왼쪽
			if (이동위치[1] > 0)
				이동위치[1] -= 1;
			break;

		case 0:
			상태코드 = 0;
			break;

		default:
			상태코드 = 10;
			break;
		}

		if (맵[이동위치[0]][이동위치[1]] == 1) {
			맵[이동위치[0]][이동위치[1]] = 2;
			맵[현재위치[0]][현재위치[1]] = 1;
			현재위치 = 이동위치;
		}

		return 상태코드;
	}

}
