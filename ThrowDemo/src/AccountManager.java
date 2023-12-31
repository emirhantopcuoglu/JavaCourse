
public class AccountManager {
	private double balance;
	
	public void deposit(double amount) {
		balance = getBalance() + amount;
	}
	
	public void withDraw(double amount) throws Exception {
		if(balance>=amount) {
			balance = getBalance() - amount;
		}else {
			throw new BalanceInsufficentException("Bakiye yetersiz");
		}
	}

	public double getBalance() {
		return balance;
	}
	
	
}
