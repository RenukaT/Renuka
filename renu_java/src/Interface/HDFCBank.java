package Interface;

public class HDFCBank implements BankApplication{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFCBank obj=new HDFCBank();
		obj.login("renu", "renusatya");
		obj.deposit(10000);
		obj.calcinterest();
		
	}

	@Override
	public void login(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("Credentials are successful");
		
	}

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		
		System.out.println("deposit amount is"+ amount );
		
	}

	@Override
	public void calcinterest() {
		// TODO Auto-generated method stub
		System.out.println("calculated interest is 10%");
	}

}
