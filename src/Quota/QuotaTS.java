package Quota;

public class QuotaTS extends Quota {
	private int currentTS;
	public int objectifTS=15;
	
	public int getCurrentTS() {
		return this.currentTS;
	}
	public int getObjectifTS() {
		return this.objectifTS;
	}
	public void setCurrentTS(int currentTS) {
		this.currentTS=currentTS;
	}

	public QuotaTS() {
		this.currentTS=0;
	}
	public QuotaTS(int currentTS) {
		this.currentTS=currentTS;
	}
	
	public void addCreditsTS (int numberOfCreditsTS) {
		if(numberOfCreditsTS>0){
			this.currentTS+=numberOfCreditsTS;
		}
	}
}
