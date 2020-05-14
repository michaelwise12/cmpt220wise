// CheckingsAccount class, with maximum overdraft limit (can be changed)
public class CheckingsAccount extends Account {

	private static final double LIMIT_OD = 250.00;
	
	public CheckingsAccount(AccountInfo info) {
		super(info);
	}
	
	@Override
	public boolean isSufficientBalance(double amount) {
		return amount <= getBalance() + LIMIT_OD;
	} 

}
