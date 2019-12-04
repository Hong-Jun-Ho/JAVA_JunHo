package 실습191118;

public class 실습12_배열 {

	public static void main(String[] arg) {
		
		String [] arr = new String[9];
		String [] arr2 = new String[9];

		for(int n=0; n<9; n++) {
		
			if(n%2==0) {
				System.out.println("");
				for(int i=0; i<9; i++) {
				arr[i]= "O";
						System.out.print(arr[i]);
				}
				}else {
					System.out.println("");
					for(int j=0; j<9; j++) {
						if(j%2==0) {
							arr2[j]="O";
						}else {
							arr2[j]=" ";
						}
							System.out.print(arr2[j]);
						}
				}
		}
		

		
	}
}
