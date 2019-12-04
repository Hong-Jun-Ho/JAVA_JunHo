package kr.gudi.conditional;

public class 실습6 {

	public static void main(String[] args) {
		

		int[] 배열 = {8,3,4,6,2,7,5,1,9};
		
	int temp;
		for(int i=0; i<배열.length; i++) {
			for(int j=i+1; j<배열.length; j++) {
			if(배열[i]>배열[j]) {
				temp =배열[i];
				배열[i]=배열[j];
				배열[j]=temp;
				}
			}
			System.out.println(배열[i]);
				}
	}

}
