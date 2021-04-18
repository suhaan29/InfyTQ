package lastPain;

public abstract class Appliance {
	
	String brand;
	String type;
	
	Appliance(String brand, String type){
		this.brand = brand;
		this.type = type;
	}
	
	abstract void calculatePrice();
	
	public static void main(String[] args)
	{
		Appliance a = new Appliance();
	}

}


