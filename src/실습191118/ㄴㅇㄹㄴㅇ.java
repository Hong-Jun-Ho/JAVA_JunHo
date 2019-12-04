package 실습191118;

public class ㄴㅇㄹㄴㅇ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] 배열 = {8,3,4,6,2,7,5,1,9};
		
	int temp;
		for(int i=0; i<배열.length; i++) {
			for(int j=i+1; j<배열.length; j++) {
			if(배열[i]<배열[j]) {
				temp =배열[i];
				배열[i]=배열[j];
				배열[j]=temp;
			}
			}
			System.out.println(배열[i]);
		}
	}


	

}
