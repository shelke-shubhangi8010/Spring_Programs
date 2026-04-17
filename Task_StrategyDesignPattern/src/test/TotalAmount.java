package test;

public class TotalAmount {

	
	
	private Atm atm=null;
	
	public TotalAmount(Atm atm) {
		
		this.atm=atm;
	}
	
	public void cheakAmount(int amount) {
		
		atm.pay(amount);
	}
}
