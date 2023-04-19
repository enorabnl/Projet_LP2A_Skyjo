package Quota;

public class QuotaT2S extends Quota {
	private int currentT2S;
	public int objectifT2S=9;
	
	
	public int getCurrentT2S() {
		return this.currentT2S;
	}
	public int getObjectifT2S() {
		return this.objectifT2S;
	}
	public void setCurrentT2S(int currentT2S) {
		this.currentT2S=currentT2S;
	}
	public QuotaT2S() {
		this.currentT2S=0;
	}
	

	/**
	 * 
	 * @param numberOfCreditsT2S is the number of credits which are supposed to be added. We control that the value given is at least 1 
	 */
	public void addCreditsT2S (int numberOfCreditsT2S) {
		if(numberOfCreditsT2S>0){
			this.currentT2S+=numberOfCreditsT2S;
		}
	}
}
