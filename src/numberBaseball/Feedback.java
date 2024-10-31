package numberBaseball;

public class Feedback {
	public int pcNum;
	private int strike;
	private int ball;
	private String numFeedback;
	private int digit;
	int[] pcCount=new int[10];
	int[] userCount=new int [10];

	public Feedback(int pcNum, int userNum, int digit) {
		this.pcNum=pcNum;
		this.strike=0;
		this.digit=digit;
		this.ball=0;
		this.numFeedback="";
	}

	public void setFeedback(int pcNum, int userNum) {
	
		String pcStr=String.valueOf(pcNum);
		String userStr=String.valueOf(userNum);
		for(int i=0;i<digit;i++) {
			if(pcStr.charAt(i)==userStr.charAt(i)) {
				strike++;
			}
		}

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
