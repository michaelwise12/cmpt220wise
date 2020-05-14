// Class for processing all of the account info - I think its nicer to keep it as a separate class from Account
// so external modules/structures can use it, and nobody can change values
public class AccountInfo {

	private final int accountId;
	private int pin;
	private String type;
	private final String accountOwner;
	private final String email;
	private double balance;
	
	AccountInfo(int accountId, int pin, String type, String accountOwner, String email, double balance) {
		super();
		this.accountId = accountId;
		this.pin = pin;
		this.type = type;
		this.accountOwner = accountOwner;
		this.email = email;
		this.balance = balance;
	}
	
	public int getAccountId() {
		return accountId;
	}
	
	public int getPin() {
		return pin;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return accountOwner;
	}
	
	public String getEmail() {
		return email;
	}
	
	public double getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		return "Account ID: " + accountId + '\n' +
				"PIN: " + pin + '\n' +
				"Account Type: " + type + '\n' +
				"Name: " + accountOwner + '\n' +
				"Email: " + email + '\n' +
				"Current Balance: $" + String.format("%,.2f", balance);
	
	}
	
}
