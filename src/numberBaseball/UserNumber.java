package numberBaseball;

import java.util.Scanner;

public class UserNumber {
	private int pcNumber;
	private int digit;
	private int userNum;

	

	
	public UserNumber(SettingNoBB settingNoBB) {
		this.digit=settingNoBB.getDigit();
		PcNumber pcNum=new PcNumber(settingNoBB); //
		this.pcNumber=pcNum.getPcNumber();
		
	}

	public void startGame(SettingNoBB settingNo) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("추측한 수를 입력해주세요.");
			String strUserNum=scan.nextLine();
			if (strUserNum.equals("기권")) {
				System.out.println("정답은 "+pcNumber+"입니다.");
				break;
			} else {
				try {
					userNum=Integer.parseInt(strUserNum);
				
					if(strUserNum.length()!=digit) {
						throw new NumberFormatException();
					}
					if(userNum==pcNumber) {
						System.out.println("축하합니다! 승리했습니다!");
						break;
					} else {
						Feedback feedback=new Feedback(pcNumber, userNum, digit);
										
						feedback.setFeedback(pcNumber,userNum);
						System.out.println(feedback.getFeedback());
					}
				} catch(NumberFormatException e) {
				System.out.println(digit+"자리 수를 입력해주세요. ");
				}					
			}
		}
		scan.close();
	}
	
	public int getUserNum() {
		return userNum;
	}
}

