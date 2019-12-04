package kr.gudi.conditional;

public class 반복문_실습 {

	public static void main(String[] arg) {
		
		int a=1; 
		while(a<10) {
			for(int i=1; i<10; i++) {
				System.out.println(a+"*"+i+" = "+(a*i));
			}
			a++;
		}
	}
}
