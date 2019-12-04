package backjun;

import java.util.Arrays;
import java.util.Scanner;

public class arr_10818 {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int arrlength = scan.nextInt();
		int[] arr = new int[arrlength];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}

		Arrays.sort(arr);

		System.out.print(+arr[0] + " ");
		System.out.println(+arr[arrlength - 1]);

	}

}
