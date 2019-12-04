package backjun;

import java.util.Scanner;

public class sum_15596 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("정수 몇개를 입력?");
		int sc = scan.nextInt();
		int[] a = new int[sc];

		for (int i = 0; i < a.length; i++) {
			a[i]=scan.nextInt();
		
		}

		System.out.println(sum(a));
	}

	static long sum(int[] a) {
		int sum2=0;
		for(int i=0; i<a.length; i++) {
			sum2+=a[i];
		}
		return sum2;
	}
	
}

