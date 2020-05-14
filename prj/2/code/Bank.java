// Class that handles all of the bank information and tells the ATM
// what to do when there's a transaction error
import java.util.*;

public class Bank {
	
	// The bank will store a list of accounts, mapping ID to the proper account
	private Map<Integer, Account> accountList = new HashMap<>();
	
	// Bank has the list of accounts, can be exported/written to a txt file
	public Bank() {
		accountList.put(12345, new CheckingsAccount(new AccountInfo(12345, 
				1111, "Checkings", "John Smith", "johnsmith@gmail.com", 1250.0)));
		accountList.put(24680, new SavingsAccount(new AccountInfo(24680, 
				1337, "Savings", "Mark Williams", "mwilliams6@hotmail.com", 750.0)));
		accountList.put(12321, new CheckingsAccount(new AccountInfo(12321, 
				1420, "Checkings", "Jessica Johnson", "jjohn1234@gmail.com", 1750.0)));
		accountList.put(30001, new SavingsAccount(new AccountInfo(30001, 
				2468, "Savings", "Emma Brown", "brownily0612@hotmail.com", 100.0)));
	}
	// Checks if the provided id exists in the bank system (security measure)
	public ErrorHandling<AccountInfo> useId(int id) {
		Account account = accountList.get(id);
		
		if (account != null) {
			return ErrorHandling.success(account.getInfo());
		} else {
			return ErrorHandling.failure("There doesn't exist an account with id #" + id);
		}
	}
	// Depositing money should always be a success(unless we create a deposit limit)
	public ErrorHandling<AccountInfo> deposit(AccountInfo info, double amount) {
		Account account = accountList.get(info.getAccountId());
		account.deposit(amount);
		return ErrorHandling.success(account.getInfo());
	}
	
	// Withdrawal can return an error if there's not sufficient funds
	public ErrorHandling<AccountInfo> withdraw(AccountInfo info, double amount) {
		Account account = accountList.get(info.getAccountId());

		boolean canWithdraw = account.withdraw(amount);
		
		if (canWithdraw) {
			return ErrorHandling.success(account.getInfo());
		} else {
			return ErrorHandling.failure("There was an error processing your withdrawal of $" +
					amount + ". Current balance: $" + account.getBalance());
		}
	}
}

