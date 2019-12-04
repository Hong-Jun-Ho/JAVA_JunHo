package kr.gudi.conditional;

public class 배열반복문 {

	public static void main(String[] arg) {
		int[] 정수배열 = new int[10];
		
		for(int 위치값 = 0; 위치값 < 정수배열.length; 위치값++) {
			정수배열[위치값] = 위치값;
		}
		
		for(int 위치값 =0; 위치값<정수배열.length; 위치값++) {
			정수배열[위치값]=위치값*(9-위치값);
			System.out.println(정수배열[위치값]);
			
			}

	}
}
