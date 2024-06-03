package task10;

public class Account {
	
	double balance,amount;
	int withdraw ,deposit;
	
	public Account() {
		balance = 1200.00;
		withdraw = 500;
		deposit = 1000;
	}
	public Account(int D , double B) {
		deposit = D;
		balance = B;
	}
	public void Withdraw() {
		amount = balance - withdraw;
		System.out.println("Balance in the account is "+ amount);
	}
	public void Deposit() {
		amount = balance + deposit;
		System.out.println("Balance in the account is "+ amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account Acc = new Account();
		System.out.println("no argument");
		Acc.Withdraw();
		
		Account Acc1 = new Account(2500 , 5000.25);
		System.out.println("two arguments");
		Acc1.Deposit();

	}

}
