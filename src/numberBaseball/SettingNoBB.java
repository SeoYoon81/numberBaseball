package numberBaseball;


import java.util.Scanner;
//자릿수 설정
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
				System.out.println(digit+"자릿수의 숫자 야구를 시작합니다.");
				break;
			} catch(NumberFormatException e) {
				System.out.println("3부터 7까지의 숫자를 입력해주세요.");
			}
		}
	}
	public int getDigit() {
		return digit;
	}	
}
