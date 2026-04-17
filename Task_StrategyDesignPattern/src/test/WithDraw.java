package test;

public class WithDraw implements Atm {
	@Override
	public void pay(int amount) {
		
		System.out.println("Withdrawl amount is the : "+amount+"rs");
	}

}
