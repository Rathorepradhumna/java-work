package inheritanceBank;

public class SavingAcc  extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAL=1000;
	public SavingAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		super(accNo, accName, accBal);
		this.isSalaried = isSalaried;
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	public static float getMinbal() {
		return MINBAL;
	}
	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
	 
	}
	@Override
	public void deposit(float amount) {
		// TODO Auto-generated method stub
		super.setAccBal(super.getAccBal()  + amount);
	}
	
}
