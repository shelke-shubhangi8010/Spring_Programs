package test;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TotalAmount total =new TotalAmount(new Deposit());
		
		total.cheakAmount(23000);
		
        TotalAmount T1 =new TotalAmount(new WithDraw());
		
		T1.cheakAmount(5000);
		
		// Setter Method
		
		/*TotalAmount T=new TotalAmount();
		T.setAtm(new WithDraw());
        T.cheakAmount(6000);*/
	}

}
