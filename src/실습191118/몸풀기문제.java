package 실습191118;

public class 몸풀기문제 {

	public static void main(String[] args) {
//		for(int i=0;i<11 ;i++) {
//			for(int j=0; j<10; j++)
//			if(i%2==0) {
//				System.out.print("O");
//			}else if(j==0) {
//				System.out.println("");
//				System.out.print("O");
//			}else if(j==9) {
//					System.out.print("O");
//					System.out.println("");
//			}else {
//				System.out.print(" ");
//			}
//		System.out.println("");
//		}
		
		for(int i=0; i<11; i++) {
			for(int j=0; j<10; j++) {
				if(i%2==1&& j==0 || j==9) {
					System.out.print("O");
					}
					else if(i%2==1) {
					System.out.print(" ");
						}else {
							System.out.print("O");
						}
			}
			System.out.println("");
		}
	}

}
