package kr.gudi.conditional;

public class 조건문3 {

	public static void main(String[] arg) {
		
		int con = 3 ; 
		boolean b = (3==con);
		
		if(b) {
			System.out.println("con은 3이다");
		} else if(con!=3) {		
			System.out.println("con은 3이 아니다"); // 
		}
				
		System.out.println((con==3)? "참" : "거짓"); //3항연산자  (비교값)? "참" : "거짓" ;
	}
}
