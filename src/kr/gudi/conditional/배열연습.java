package kr.gudi.conditional;

public class 배열연습 {

	public static void main(String[] args) {
		
		int arr[][] = new int [5][];

		arr[0] = new int [5]; 
		arr[1] = new int [1]; 
		arr[2] = new int [3]; 
		arr[3] = new int [4]; 
		arr[4] = new int [6]; 
		
		
		System.out.println(arr[0].length);
	
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
			System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
		
	
	}

}
