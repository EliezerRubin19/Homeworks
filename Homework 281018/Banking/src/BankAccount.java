

public class BankAccount {

	private String accountName;
	private String accountNum;
	private double balance;
	private boolean isOverDraftAllowed;
	private double overDraftSum;

	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isOverDraftAllowed() {
		return isOverDraftAllowed;
	}

	public void setOverDraftAllowed(boolean isOverDraftAllowed) {
		this.isOverDraftAllowed = isOverDraftAllowed;
	}

	public double getOverDraftSum() {
		return overDraftSum;
	}

	public void setOverDraftSum(double overDraftSum) {
		this.overDraftSum = overDraftSum;
	}

	public BankAccount() {
		super();
		this.accountName = "Account";
		this.accountNum = "00001";
		this.isOverDraftAllowed = false;
		this.balance = 0;
		this.overDraftSum = 0;

	}

	public BankAccount(String accountName, String accountNum, double balance, boolean isOverDraftAllowed,
			double overDraftSum) {
		this.accountName = accountName;
		this.accountNum = accountNum;
		this.balance = balance;
		this.isOverDraftAllowed = isOverDraftAllowed;
		this.overDraftSum = overDraftSum;
	}

	
	public void addAmount(double amount) {
		balance+=amount;
	}
	public void substractAmount(double amount) {
		balance-=amount;
	}
	
	public void deposit(double amount) {
		if (amount<0) {
			System.out.println("Not valid amount, must be positive");
		}else {
			addAmount(amount);
			System.out.println("You deposited $"+amount+" dollars");
		}
	}

	public void withdraw(double amount) {	
		if (amount<0) {
			System.out.println("Not valid amount, must be positive");
		}else if (balance - amount > overDraftSum*(isOverDraftAllowed?-1:0)) {
			substractAmount(amount);
			System.out.println("You withdraw $"+amount+" dolars");
	}else{
				 System.out.println("You tried to withdraw $"+amount+" dollars. You exceeded your limits. You can withdraw up to a "
				 		+ "maximum of $"+(balance+overDraftSum));
		}
	}
	@Override
	public String toString() {
		System.out.println();
		return "Account Name is " + accountName + "   " + "Account number is " + accountNum
				+ "\n" + "Balance is " + balance + "    " + "OverDraft allowed? " + isOverDraftAllowed + "    "
				+ "Overdraft Sum " + overDraftSum+"\n";
	}
}

