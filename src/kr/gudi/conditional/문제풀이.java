package kr.gudi.conditional;

public class 문제풀이 {
	public static void main(String[] arg) {
	double 성적 = 4.31;

	if(성적>=4.0 && 성적<4.3) {
		System.out.println("장학금 200만원!!");
	}else if(성적>=4.3) {
		System.out.println("장학금 400만원!!");
	}else {
		System.out.println("안타깝게도 장학금을 받을 수 없습니다.");
	}
}
}