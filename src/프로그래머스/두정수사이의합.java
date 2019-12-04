package 프로그래머스;

public class 두정수사이의합 {

	public long solution(int a, int b) {
	      long answer = 0;
	      long sum=0;
	      if(a<b) {
	      for(long i=a; i<=b; i++) {
	    	  sum=sum+i;
	      }
	      }else {
	    	   for(long i=b; i<=a; i++) {
	 	    	  sum=sum+i;
	 	      }
	      }
	      
	      answer=sum;
	      
	      return answer;
	  }
	public static void main(String[] args) {
		두정수사이의합 t1 = new 두정수사이의합();
		System.out.println(t1.solution(3, 5));
	
	}

}
