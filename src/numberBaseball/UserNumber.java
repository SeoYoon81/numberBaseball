package numberBaseball;

import java.util.Scanner;

import numberBaseball.Feedback;
import numberBaseball.PcNumber;
import numberBaseball.SettingNoBB;
import numberBaseball.UserNumber;

public class UserNumber {
	private int pcNumber;
	private int digit;
	private int userNum;

	public UserNumber(PcNumber pcNum,SettingNoBB settingNoBB) {
		this.pcNumber=pcNum.getPcNumber();
		this.digit=settingNoBB.getDigit();
	}

	//// 게임 관련 메서드 
	public void startGame(PcNumber pcNum, SettingNoBB settingNo, UserNumber userNumber) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("추측한 숫자를 입력해주세요");
			String strUserNum=scan.nextLine();
			if (strUserNum.equals("기권")) {
				System.out.println(pcNumber);
				break;
			} else {
				try {
					userNum=Integer.parseInt(strUserNum);
					//범위 조건=> 자릿수로 비교 가능 만족 및 던지기
					if(strUserNum.length()!=digit) {
						throw new NumberFormatException();
					}
					if(userNum==pcNumber) {
						System.out.println("축하합니다! 승리했습니다! ");
						break;
					} else {
						Feedback feedback=new Feedback(pcNum, settingNo, userNumber);
					// 피드백 반환.... 					
						feedback.setFeedback(pcNumber,userNum);
						System.out.println(feedback.getFeedback());
					}
				} catch(NumberFormatException e) {
				System.out.println(digit+"자리 숫자를 입력해주세요. ");
				}					
			}
		}	
	}
	public int getUserNum() {
		return userNum;
	}
}
