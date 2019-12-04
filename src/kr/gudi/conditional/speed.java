package kr.gudi.conditional;

public class speed {

	public static void main(String[] args) {
		int IQ = 100;

		 if(IQ>120){
			System.out.println("똑똑하다");
		}else if(IQ<120 && IQ>=100){
			System.out.println("보통이다");
		}else{
			System.out.println("부족하다");
		}

}
}
