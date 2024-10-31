package numberBaseball;


import java.util.Scanner;

public class SettingNoBB {
	private int digit;		
	public void setup() {
		Scanner scan=new Scanner(System.in);		
		while(true) {
			System.out.println("자릿수를 입력해주세요.");				
			String digStr=scan.nextLine();
			try {
				digit=Integer.parseInt(digStr);
				if(digit<3||digit>7) {
					throw new NumberFormatException();
				}
				System.out.println(digit+"자릿수 숫자야구를 시작합니다.");
				break;
			} catch(NumberFormatException e) {
				System.out.println("3이상 7이하의 수를 입력해주세요.");
			}
		}
	}
	public int getDigit() {
		return digit;
	}	
}
