// The Account class is abstract for the subclasses of Savings/Checkings. (you wouldn't like people to change that at will) 
public abstract class Account {
	
	private AccountInfo info;

	public Account(AccountInfo info) {
		super();
		this.info = info;
	}

	public AccountInfo getInfo() {
		return info;
	}
	
	private void updateBalance(double newAmount) {
		info = new AccountInfo(info.getAccountId(), info.getPin(), info.getType(), info.getName(),
				info.getEmail(), newAmount);
	}
	// Deposit
	public void deposit(double amount) {
		updateBalance(getBalance() + amount);
	}
	// Withdraw (checks if balance is sufficient)
	public boolean withdraw(double amount) {
		if (isSufficientBalance(amount)) {
			updateBalance(getBalance() - amount);
			return true;
		} else {
			return false;
		}
	}
	
	// Get Balance
	public double getBalance() {
		return info.getBalance();
	}
	// Checks if the amount they want to withdraw is in the account
	public boolean isSufficientBalance(double amount) {
		return amount <= getBalance();
	}
}
