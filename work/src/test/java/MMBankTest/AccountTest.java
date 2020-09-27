package MMBankTest;

import static org.junit.Assert.*;
import org.junit.Test;

import mmBank.Account;
import mmBank.PaymentGateway;
public class AccountTest {
	@Test
	public void testOne()  throws Exception {
		Account test1  = new Account("Pradhumna",5000);
		test1.deposit(2000);
		assertEquals(7000,test1.getBalance());
		try {
			test1.withdraw(100);
		}
		catch(Exception e) {
			assertEquals("Amount exceeding balance available",e.getMessage());
		}
		Account test2 = new Account("Namrata",2000);
		
		assertEquals(true,PaymentGateway.transfer(test1, test2, 400));
		
		
		
	}
	@Test
	public void testTwo()  throws Exception {
		Account test1  = new Account("Pradhumna");
		//test1.deposit(2000);
		//assertEquals(7000,test1.getBalance());
		try {
			test1.withdraw(10000);
		}
		catch(Exception e) {
			assertEquals("Amount exceeding balance available",e.getMessage());
		}
		
	}

}
