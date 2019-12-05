package by.htp.task4.view;

import by.htp.task4.entity.Account;

public class AccountPrinter {

	public void print(Account account) {
		System.out.println("Account number: " + account.getNumber() + "\tBalance: " + account.getBalance()
				+ "\tBlocked: " + account.isBlocked());
	}

}
