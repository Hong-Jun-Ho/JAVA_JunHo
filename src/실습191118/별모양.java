package 실습191118;

public class 별모양 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		for(int i=1; i<=28; i++) {
			for(int j=1; j<=41; j++) {
				
				if((i<=7 ||(i>=15 && i<=21)) && j<=21 && i+j>=22) {
					System.out.print("*");
				}
				else if((i<=7 ||(i>=15 && i<=21)) && j>=22 && j-i<=20) {
					System.out.print("*");
				} //위에 삼각형 /중간 2구역
				else if((i>=8 || i>=22) && j<=21 && i-j<=7) {
					System.out.print("*");
				}
				else if((i>=8 ||i>=22) && j>=22 && i+j<=49) {
					System.out.print("*");
				}
				//중간 1구역 / 아래 삼각형 
	
					else {
						System.out.print(" ");
					}
				}
			System.out.println("");
			}
	}
}
