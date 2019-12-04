package 실습191118;
import java.util.Scanner;
public class 배열연습_혼자 {

	static int sc;
	static int sc2;
	
	public static void 입력() {
		
		Scanner scan=new Scanner(System.in); 
		
		System.out.print("행의 값을 입력하세요 : ");
		sc =scan.nextInt();
	
		System.out.print("열의 값을 입력하세요 : ");
		sc2 = scan.nextInt();
		
		scan.close();
		
	}
	
	public static void main(String[] args) {
	
		입력();
		
		String[][] arr = new String [sc][sc2];
	
	
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				if(i%2==0) {
					arr[i][j]="O";
					
				}else if(j%2==0){
					arr[i][j]="O";
					
				}else {
					arr[i][j]=" ";
				}
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
		System.out.println("시스템 종료합니다.");
	}

}
