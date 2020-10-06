package inheritanceBank;

public abstract class BankAcc {
	private int accNo;
	private String accName;
	private float accBal;
	public BankAcc(int accNo, String accName, float accBal) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	public String getAccName() {
		return accName;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public abstract void withdraw(float amount);
	public abstract void deposit(float amount);
}
