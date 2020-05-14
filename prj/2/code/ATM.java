// Class that processes all the user functions of the ATM. Communicates with bank to update data,
//  and deals with transcation errors.
import java.util.function.*;

public class ATM {

	private final Bank bank;
	private AccountInfo info = null;
	
	public ATM(Bank bank) {
		this.bank = bank;
	}
	
	// Only update user data if action result is successful
	private Consumer<AccountInfo> update = data -> {
		info = data;
	};
	
	public void login(int id) {
		tryCall(
				() -> bank.useId(id),
				update
		);
	}
	
	public void deposit(double amount) {
		if (info != null) {
			tryCall(
					() -> bank.deposit(info, amount),
					update
					);
			
		}
	}
	
	public void withdraw(double amount) {
		if (info != null) {
			tryCall(
					() -> bank.withdraw(info, amount),
					update
					);
		}
	}
	
	public void exit() {
		if (info != null) {
			info = null;
		}
	}
	
	public AccountInfo getInfo() {
		if (info != null ) {
			return info;
		} else {
			return null;	
		}
	}
	@Override
	public String toString() {
		return info != null ? info.toString() : "Thank you for choosing Wise ATM! Please type your ID \n into the box in the bottom left and press 'Confirm' to \n view your account details.";
	}
	// Helper function to pass any actions that fail
	private <T> void tryCall(Supplier<ErrorHandling<T> > action, Consumer<T> postAction) {
		try {
			ErrorHandling<T> result = action.get();
			if (result.isSuccessful()) {
				T data = result.getData();
				postAction.accept(data);
			} else {
				String error = result.getError();
				throw new RuntimeException(error);
			} 	
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
