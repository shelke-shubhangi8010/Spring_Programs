package test;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ShoppingCart cart= new ShoppingCart(new PayPalPayment() );
		
		
		/*cart.setPaymentStrategy(new CreditCardPayment() );
		//cart.cheakout(100);
		
		cart.setPaymentStrategy(new CryptoPayment() );*/
		cart.cheakout(100);
       
	}

}
