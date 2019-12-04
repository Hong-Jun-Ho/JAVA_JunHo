package kr.gudi.conditional;

public class 구구단 {

	public static void main(String[] arg) {
		
		int 입력 =2;
		
		for(int i=1; i<10; i+=입력) {
			for(int j=1; j<10; j++) {
				String 행 = "";
				for(int 열=0; 열<입력; 열+=2 ) {
					if(i+열<10){
					행 += (i+열)+" * "+j+" ="+(i+열)*j;
					}
				}
				System.out.println(행);
				
			}
	
		}	
		
	}
}
