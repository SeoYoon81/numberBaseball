package numberBaseball;
//int digit=자릿수 

import numberBaseball.PcNumber;
import numberBaseball.SettingNoBB;
import numberBaseball.UserNumber;

public class NumberBaseballEx {
	
	public static void main(String[] args) {
		//자릿수 설정
		SettingNoBB settingNo=new SettingNoBB();
		settingNo.setup();
		System.out.println("");
		// 규칙 설명
		System.out.println("S(스트라이크) - 숫자와 자리가 모두 일치");
		System.out.println("B(볼) - 숫자는 맞지만 자리가 다름 ");
		System.out.println("OUT(아웃) - 일치하는 숫자 없음");	
		System.out.println("'기권'을 입력하면 정답이 출력됩니다.");
		System.out.println("");
		// pc 숫자 설정
		PcNumber pcNum=new PcNumber(settingNo);
		pcNum.getPcNumber();
		
//		게임 진행
		
		UserNumber userNum = new UserNumber(pcNum, settingNo);
		userNum.startGame(pcNum, settingNo, userNum);
	}
}
