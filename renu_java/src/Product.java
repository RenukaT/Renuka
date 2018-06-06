
public class Product {

	public String name;
	public double price;
	public String skuId;
	
	public void purchase(int quantity)
	{
		System.out.println("No of purchase Items:"+ quantity);
	}
	
	public double calculatetotalprice(int quantity)
	{
		return (quantity*price);
	}
	
	public void display()
	{
		System.out.println("Product name is:"+ name);
		System.out.println("Product price is:"+ price);
		System.out.println("Product price is:"+ price);
	}
}
