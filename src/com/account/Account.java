package com.account;

public class Account {
 
	private int accountBalance;

	public void depositMoney(int amount) {
		// TODO Auto-generated method stub
		if(amount >= 0)
		accountBalance += amount;
	}

	public int getAccountBalance() {
		// TODO Auto-generated method stub
		return accountBalance;
	}

//	public void withdrawCash(int cashWithdrawn) {
//		// TODO Auto-generated method stub
//		accountBalance = accountBalance - cashWithdrawn;
//	}

	public void withdrawCashWithPin(int cashWithdrawnWithPin, int pin) {
		// TODO Auto-generated method stub
		if(checkPin(pin) && checkMinimum(cashWithdrawnWithPin))
			accountBalance -= cashWithdrawnWithPin;
		
		else
			System.out.println("invalid");
	}
	
	private boolean checkPin(int pin) {
		if (pin == 5555)
			return true;
		else return false;
	}
	
	private boolean checkMinimum (int amount) {
		int balance = accountBalance - amount;
		if (balance >= 1000)
			return true;
		else return false;
	}
	
	

	public void withdrawWithinBalance(int cashWithdrawnWithinBalance) {
		// TODO Auto-generated method stub
		
		if(cashWithdrawnWithinBalance > accountBalance)
			System.out.println("insufficient balance");
		else
			accountBalance -= cashWithdrawnWithinBalance;
	}
	

}
