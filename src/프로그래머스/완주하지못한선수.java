package 프로그래머스;

public class 완주하지못한선수 {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
        for(int i=0; i<participant.length; i++){
            for(int j=0; j<completion.length; j++){
                if(participant[i].equals(completion[j])){
                    participant[i]="0";
                    completion[j]="0";
                }
            }
        }
        for(int n=0; n<participant.length; n++){
            if(!participant[n].equals("0")){
                answer=participant[n];
            }
        }
        return answer;
	}

	public static void main(String[] args) {

		// 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
//		completion의 길이는 participant의 길이보다 1 작습니다.
//		참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
//		참가자 중에는 동명이인이 있을 수 있습니다.

		String[] 참가자 = {"mislav", "stanko", "mislav", "ana"};
		String[] 완주자 = {"stanko", "ana", "mislav"};
		System.out.println(solution(참가자, 완주자));

	}

}
