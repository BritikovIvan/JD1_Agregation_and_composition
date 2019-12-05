package by.htp.task4.logic;

import java.util.Comparator;

import by.htp.task4.entity.Account;

public class AccountBalanceComparator implements Comparator<Account> {

	@Override
	public int compare(Account a1, Account a2) {
		int balance1 = a1.getBalance();
		int balance2 = a2.getBalance();
		if (balance1 < balance2) {
			return -1;
		} else if (balance1 == balance2) {
			return 0;
		} else {
			return 1;
		}
	}

}
