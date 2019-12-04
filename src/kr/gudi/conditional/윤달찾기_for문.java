package kr.gudi.conditional;

public class 윤달찾기_for문 {

	public static void main(String[] args) {
		int count=0;
		int countyear=0;
		
		for(int i=2000; i<=2019; i++) {
			if((i%4==0 && i%100!=0) || i%400==0) {				// 4년 주기로 윤년
				count++;
			}
			
			countyear++;
		}
			
		System.out.println("2000년부터 2019년까지 2월28일의 수는:" +(countyear-count)+"회 입니다.");
	}
}


