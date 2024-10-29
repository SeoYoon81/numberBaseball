package numberBaseball;

import numberBaseball.SettingNoBB;

public class PcNumber {
	private SettingNoBB settingNoBB;
	private int digit;
	private int pcNumber;
	public PcNumber(SettingNoBB settingNoBB) {
		this.settingNoBB=settingNoBB;
		this.digit=settingNoBB.getDigit();
		this.pcNumber=(int)(Math.random()*9*Math.pow(10,digit-1)+Math.pow(10,digit-1));
	}
	public int getPcNumber() {
		return pcNumber;
	}
}
