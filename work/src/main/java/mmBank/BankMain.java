package mmBank;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("pradhumna",1000);
		a1.displayAccountDetails();
		Account.getNextAccountNumber();
		Account a2 = new Account("Namrata",500);
		a2.displayAccountDetails();
		boolean b = PaymentGateway.transfer(a2, a1, 200);
		if(b) {
			System.out.println("Funds transfered successfully");
		}
		else {
			System.out.println("Funds transfered failed due to insufficient balance");
		}
		a1.displayAccountDetails();
		a2.displayAccountDetails();
	}

}
