package justPain;

public class Customer {
	private int counter = 100;
	private int customerId;
	
	public Customer() {
		this.customerId = 0;
	}
	
	public int getCustomerId() {
		return this.customerId;
	}
	
	public int purchasePhone(MobilePhone phone) {
		this.counter +=1;
		this.customerId = this.counter;
		return phone.identifyBasicCost();
	}
	
	public static void main(String[] args) {
		MobilePhone ob = new SmartPhone("Samsung", "LED");
		Customer c1 = new Customer();
		int basicCost = c1.purchasePhone(ob);
		System.out.println(c1.getCustomerId() + " " + basicCost);
		ob = new MobilePhone("Nokia");
		Customer c2 = new Customer();
		basicCost = c2.purchasePhone(ob);
		System.out.println(c2.getCustomerId()+" "+ basicCost);
	}
}