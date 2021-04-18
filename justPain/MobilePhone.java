package justPain;

public class MobilePhone {

	private String brand;
	public MobilePhone (String brand) {
		this.brand = brand;
	}
	
	public int identifyBasicCost() {
		if(this.brand.equals("Nokia")) {
			return 5000;
		}
		else if (this.brand.equals("Samsung")) {
			return 15000;
		}
		else {
			return 0;
		}
	}
}
