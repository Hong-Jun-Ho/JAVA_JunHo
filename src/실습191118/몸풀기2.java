package 실습191118;

public class 몸풀기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<11; i++) {
			for(int j=0; j<=10; j++) {
				if(i%2==1&& j%2==0) {
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
