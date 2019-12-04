package kr.gudi.conditional;

public class 배열_2차원 {

	public static void main(String[] args) {
		int [][]arr =new int[6][6];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j< arr.length;j++) {
			if(i==j){
				arr[i][j]=1;	
			}
			System.out.print(arr[i][j]);
		
			}
			System.out.println("");
		}
		System.out.println(arr.length);
	}
}
	
