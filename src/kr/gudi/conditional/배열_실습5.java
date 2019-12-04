package kr.gudi.conditional;

public class 배열_실습5 {

	public static void main(String[] args) {
		int[] x축 = {0,1,0,2,0,3,0,4,0,5};
	
		
		int temp;
			for(int i=0; i<x축.length;i+=2) {
				temp = x축[i];
				x축[i] = x축[i+1];
				x축[i+1] =temp;
			}
			for(int j =0; j<x축.length; j++) {
				System.out.println(x축[j]);
			}
									
	
	}

}
