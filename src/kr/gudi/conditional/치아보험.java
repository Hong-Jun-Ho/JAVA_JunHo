package kr.gudi.conditional;

public class 치아보험 {

	public static void main(String[] args) {
		int 썪은이=7;
		int 임플란트=1;
	if(썪은이>0) {
		System.out.println("썪은이로는 " +썪은이*30+"만원을 받을 수 있습니다.");
	}
	if(임플란트>0) {
		System.out.println("임플란트로는 " +임플란트*100 + "만원을 받을 수 있습니다.");		
	}
	if(썪은이>0 && 임플란트>0) {
		System.out.println("총 받을 수 있는 금액은 "+ (썪은이*30+임플란트*100) + "만원을 받을 수 있습니다.");			
	}

	}

}
