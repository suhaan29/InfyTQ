package testName;

public class HandBag extends testOne {
	
	String shape;
	HandBag(float price, String color, String shape)
	{
		super(price, color);
		this.shape = "Barrel";
	}
	
	int identifyDiscountAmount() {
		int discountAmount = 0;
		if(this.shape.equals("Hobe")) 
		{
			discountAmount = 15;
			
		}
		else if(this.shape.equals("Barrel"))
		{
			discountAmount = 8;
		}
		return discountAmount;
	}

	void calculatePrice() {
		int discountAmount = this.identifyDiscountAmount();
		this.price = this.price - ((discountAmount*this.price)/100.0f);
	}
	
	public static void main(String[] args) {
		HandBag ob = new HandBag(650, "Black", "Hobe");
		ob.calculatePrice();
		System.out.println((int)ob.price);
		ob.shape = "Clutch";
		ob.calculatePrice();
		System.out.println((int)ob.price);
	}
	
}
