package testName;

public class testOne {

	float price;
	String color;

	testOne(float price, String color) {

		this.price = price;
		this.color = color;

	}
	
	int identifyDiscountAmount() {
		int discountAmount = 0;
		if(this.color.equals("Black"))
		{
			discountAmount = 10;
		}
		
		return discountAmount;
	}

}
