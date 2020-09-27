package mmBank;

public class PaymentGateway {
	public static boolean transfer(Account sender, Account reciever, int amount) 
	{
		//If the sender account balance = the given amount then the amount is transferred from the 
		//sender to the reciever account and true is returned
		//otherwise false is returned.
		if(sender.getBalance()>=amount) {
			try {
			sender.withdraw(amount);
			reciever.deposit(amount);
			}
			catch(Exception e) {
				System.out.println("Transfer not possible");
			}
			return true;
		}
		else {
			return false;
		}
	}
}
