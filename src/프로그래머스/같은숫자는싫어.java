package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class 같은숫자는싫어 {

	public int[] solution(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int n = 1; n < arr.length - i; n++) {
				if (arr[i] == arr[i + n]) {
					arr[i + n] = -1;
				}else {
					break;
				}
			}
		}

		ArrayList<Integer> divArray = new ArrayList<Integer>();
		for (int i : arr) {
			if (i != -1) {
				divArray.add(i);
			}
		}

		int[] answer = new int[divArray.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = divArray.get(i).intValue();
		}
		return answer;
	}

	public static void main(String[] arg) {
		같은숫자는싫어 div = new 같은숫자는싫어();
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		System.out.println(Arrays.toString(div.solution(arr)));
	}
}
