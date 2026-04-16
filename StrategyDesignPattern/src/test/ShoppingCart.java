package test;

public class ShoppingCart {

	private PaymentStrategy paymentStrategy;
	
	// setter injection
	
/*	public void  setPaymentStrategy(PaymentStrategy paymentStrategy) 
	{
		this.paymentStrategy = paymentStrategy;
	}
	
	*/
	public void cheakout(int amount)
	{
		paymentStrategy .pay(amount);
	}
	
	// constructor injection
	
	public ShoppingCart(PaymentStrategy paymentStrategy)
	{
		this.paymentStrategy = paymentStrategy;
	}
}
