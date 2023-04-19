package Quota;

public class QuotaTM extends Quota {
	private int currentTM;
	public int objectifTM=12;
	
	public int getCurrentTM() {
		return this.currentTM;
	}
	public int getObjectifTM() {
		return this.objectifTM;
	}
	public void setCurrentTM(int currentTM) {
		this.currentTM=currentTM;
	}


	public QuotaTM() {
		this.currentTM=0;
	}
	public QuotaTM(int currentTM) {
		this.currentTM=currentTM;
	}
	
	public void addCreditsTM (int numberOfCreditsTM) {
		if(numberOfCreditsTM>0){
			this.currentTM+=numberOfCreditsTM;
		}
	}
}
