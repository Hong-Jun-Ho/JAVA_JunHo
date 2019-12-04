package 프로그래머스;


import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

	  public int[] divisible(int[] array, int divisor) {
	      ArrayList<Integer> divArray = new ArrayList<Integer>();
	      for(int i : array){
	          if(i % divisor == 0){
	          divArray.add(i);
	        }
	      }

	      int[] ret = new int[divArray.size()];
	      for(int i=0; i<ret.length; i++){
	        ret[i] = divArray.get(i).intValue();      
	      }
	      
	      return ret;
	  }
	
	public static void main(String[] args) {
		 나누어떨어지는숫자배열 div = new 나누어떨어지는숫자배열();
	      int[] array = {5, 9, 7, 10};
	      System.out.println( Arrays.toString( div.divisible(array, 5) ));
	    }
}
