package numberBaseball;

import numberBaseball.PcNumber;
import numberBaseball.SettingNoBB;
import numberBaseball.UserNumber;

//userNumber와 pc Number 비교하여 피드백 반환 
public class Feedback {
	private int userNum;
	private int pcNum;
	private int strike;
	private int ball;
	private String numFeedback;
	private int digit;
	int[] pcCount=new int[10];
	int[] userCount=new int [10];
	//생성자
	public Feedback(PcNumber pcNum,SettingNoBB settingNoBB,UserNumber userNum) {
		this.pcNum=pcNum.getPcNumber();
		this.digit=settingNoBB.getDigit();
		this.userNum=userNum.getUserNum();
		this.strike=0;
		this.ball=0;
		this.numFeedback="";
	}
	// 비교 로직
	public void setFeedback(int pcNum, int userNum) {
	
		String pcStr=String.valueOf(pcNum);
		String userStr=String.valueOf(userNum);
		for(int i=0;i<digit;i++) {
			if(pcStr.charAt(i)==userStr.charAt(i)) {
				strike++;
			}
		}
		
			//pcCount userCount 로직
		int[]pcCount=countDigits(pcStr);
		int[]userCount=countDigits(userStr);
		for(int i=0;i<10;i++) {			
			ball+=Math.min(pcCount[i], userCount[i]);			
		}
		ball-=strike;
		if(strike==0&&ball==0) {
			numFeedback="OUT";
		}else {
			numFeedback=strike+"S"+ball+"B";	
		}
	}
	public String getFeedback() {
		return numFeedback;
	}
	public int[] countDigits(String strNum) {
		int[] count= new int [10];
		for(char c: strNum.toCharArray()) {
			count[c-'0']++;
		}
		return count;
	}
}
