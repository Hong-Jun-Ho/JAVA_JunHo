package 프로그래머스;

public class 가운데글자가져오기 {
	public static String solution(String s) {
	      String answer = "";
	      
	      if(s.length()%2==0) {
	    	answer=  s.substring((s.length()/2-1),(s.length()/2+1));
	      }else {
	    	  answer=  s.substring((s.length()/2),(s.length()/2+1));
	      }
	      return answer;
	}
	
	
	public static void main(String[] args) {
		String a="abcdefg";
		System.out.println(a.length());
		System.out.println(solution(a));
	}

}
