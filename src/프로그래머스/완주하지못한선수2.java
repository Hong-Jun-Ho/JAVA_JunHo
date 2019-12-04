package 프로그래머스;
import java.util.Arrays;

public class 완주하지못한선수2 {
	public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i =0;    
        for(i =0; i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }   
        }
        return participant[i];
    }
	public static void main(String[] args) {
		String[] 참가자 = {"mislav", "stanko", "mislav", "ana"};
		String[] 완주자 = {"stanko", "ana", "mislav"};
		System.out.println(solution(참가자, 완주자));

	}

}
