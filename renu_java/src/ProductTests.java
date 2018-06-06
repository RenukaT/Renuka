
public class ProductTests extends Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product Iphone=new Product();
		Iphone.name="Iphone";
		Iphone.price=399.00;
		Iphone.skuId="Iphone001";
		Iphone.purchase(1);
		double x=Iphone.calculatetotalprice(2);
		System.out.println(x);
		Iphone.display();
		
		Product Desktop=new Product();
		
		Desktop.name="Desktop";
		Desktop.price=199.00;
		Desktop.skuId="Desktop001";
		Desktop.display();
		
		
	}

}
