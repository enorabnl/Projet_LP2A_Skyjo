package Quota;

public class Quota {
	private int currentTotal;
	private int totalObjectif;
	
	public int getCurrentTotal() {
		return this.currentTotal;
	}
	public int getTotalObjectif() {
		return this.totalObjectif;
	}
	public void setCurrentTotal(int currentTotal) {
		this.currentTotal=currentTotal;
	}
	public void setTotalObjectif(int totalWanted) {
		this.totalObjectif=totalWanted;
	}
	
	
	
	public Quota(int totalObjectif) {
		this.totalObjectif=totalObjectif;
		this.currentTotal=0;
	}
	public Quota() {
		this.totalObjectif=0;
		this.currentTotal=0;
	}
	public Quota(int currentTotal, int totalOblectif) {
		this.currentTotal=currentTotal;
		this.totalObjectif=totalObjectif;		
	}
	
	public void addCredits (int numberOfCredits) {
		if(numberOfCredits>0){
			this.currentTotal+=numberOfCredits;
		}
	}

}

