package painful;

public class MobilePhone extends ElectronicProduct {

	void init(int marketPrice) {
		ElectronicProduct.marketPrice = marketPrice;
	}
	
	public static void main(String[] args)
	{
		Product product = new ElectronicProduct();
		product.init(12);
		ElectronicProduct elec = (ElectronicProduct) product;
		System.out.println(Product.marketPrice);
		System.out.println(ElectronicProduct.marketPrice);
		elec.init(50);
		System.out.println(ElectronicProduct.marketPrice);
		ElectronicProduct elec2 = new MobilePhone();
		
		MobilePhone mobi = (MobilePhone) elec2;
		mobi.init(150);
		System.out.println(ElectronicProduct.marketPrice);
	}
}
