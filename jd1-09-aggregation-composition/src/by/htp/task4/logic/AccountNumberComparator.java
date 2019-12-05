package by.htp.task4.logic;

import java.util.Comparator;

import by.htp.task4.entity.Account;

public class AccountNumberComparator implements Comparator<Account> {
	
	@Override
	public int compare(Account a1, Account a2) {
		return a1.getNumber().compareTo(a2.getNumber());
	}

}
