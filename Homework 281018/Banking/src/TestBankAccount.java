
public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount saving=new BankAccount();
		BankAccount myBank=new BankAccount("Myacct", "1111", 1000, true, 200);

		System.out.println(saving.toString());	
		saving.withdraw(100);
		System.out.println(saving.toString());
		saving.deposit(200);
		System.out.println(saving.toString());
		saving.deposit(-200);
		System.out.println(saving.toString());
		
		System.out.println(myBank.toString());
		myBank.deposit(300);
		System.out.println(myBank.toString());
		myBank.withdraw(500);
		System.out.println(myBank.toString());
		myBank.withdraw(1500);
		System.out.println(myBank.toString());
		
		
		
	
	
	}

}
