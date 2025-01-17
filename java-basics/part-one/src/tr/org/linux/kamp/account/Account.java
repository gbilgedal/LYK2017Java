package tr.org.linux.kamp.account;

public class Account {
	private String name;
	private double balance;

	// constructor
	public Account(String name, double balance) {
		this.name = name;

		if (balance > 0.0) {
			this.balance = balance;
		}
	}

	// constructor
	public Account() {

	}

	// constructor
	public Account(String name) {
		this.name = name;
	}

	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
			balance = balance + depositAmount;
		}
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
