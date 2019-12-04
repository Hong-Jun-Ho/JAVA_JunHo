package 실습191118;

public class 반복문연습4 {
	public static void main(String[] arg) {
	for(int i=0; i<=10; i++) {
		for(int j=10; j>=0; j--) {
			if(i<j) {
				System.out.print(" ");
			}else {
				System.out.print("O");
			}
		}
		
		System.out.println("");
	}
}
}
