package 프로그래머스;

public class 자바2016년 {
	public static String solution(int a, int b) {
	      String answer = "";
	      String [] arr = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	      int num=5;
	      int [] 월 = {1,2,3,4,5,6,7,8,9,10,11,12};
	      int [] 일 = {31,29,31,30,31,30,31,31,30,31,30,31};
	    
	   if(a!=1) {
		    for(int i=0; i<월[(a-2)]; i++){ //전월까지의 날짜
		          for(int j=1; j<=일[(월[i]-1)];j++) {
		              num++;
		  	    System.out.println(num);
		  	  
		      }
	   }
	   }
	   
	     answer=arr[((num+b-1)%7)];
	     return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(5,24));
	}

}
