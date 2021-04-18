package justPain;

public class SmartPhone extends MobilePhone {
	
	private String displayType;
	public SmartPhone(String brand, String displayType) {
		super(brand);
		this.displayType = displayType;
	}
	
	public int identifyBasicCost() {
		int basicCost = super.identifyBasicCost();
		if(this.displayType.equals("LED")) {
			basicCost +=20000;
		}
		
		else if(this.displayType.equals("AMOLED")) {
			basicCost += 25000;
		}
		
		return basicCost;
	}

}

