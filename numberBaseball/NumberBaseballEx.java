package numberBaseball;

public class NumberBaseballEx {	
	public static void main(String[] args) {		
		SettingNoBB settingNo=new SettingNoBB();
		settingNo.setup();
		System.out.println("");
		
		System.out.println("S(스트라이크) - 숫자와 위치가 일치");
		System.out.println("B(볼) - 숫자는 일치하지만 위치가 다름 ");
		System.out.println("OUT(아웃) - 일치하는 것이 없음");	
		System.out.println("'기권'을 입력하면 정답이 출력되고 게임이 끝납니다.");
		System.out.println("");
	
		UserNumber userNum = new UserNumber(settingNo);
		userNum.startGame(settingNo);
	}
}
