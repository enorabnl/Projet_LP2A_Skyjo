package Quota;

public class QuotaEC extends Quota {
	private int currentEC;
	public int objectifEC=6;
	
	public int getCurrentEC() {
		return this.currentEC;
	}
	public int getObjectifEC() {
		return this.objectifEC;
	}
	public void setCurrentEC(int currentEC) {
		this.currentEC=currentEC;
	}

	
	public QuotaEC() {
		this.currentEC=0;
	}
	public QuotaEC(int currentEC) {
		this.currentEC=currentEC;
	}
	
	public void addCreditsEC (int numberOfCreditsEC) {
		if(numberOfCreditsEC>0){
			this.currentEC+=numberOfCreditsEC;
		}
	}
}
