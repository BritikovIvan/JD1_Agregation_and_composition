package by.htp.task4.logic;

import by.htp.task4.entity.Account;
import by.htp.task4.entity.Client;

public class ClientLogic {
	
	public Account findAccountByNumber(Client client, String number) {
		
		for (Account account : client.getAccounts()) {
			String num = account.getNumber();
			
			if (num.equals(number)) {
				return account;
			}
		}
		
		return null;
	}
	
	public int amountPositiveBalance(Client client) {
		int amount = 0;
		
		for (Account account : client.getAccounts()) {
			int balance = account.getBalance();
			
			if (balance > 0) {
				amount += balance;
			}
		}
		
		return amount;
	}
	
	public int amountNegativeBalance(Client client) {
		int amount = 0;
		
		for (Account account : client.getAccounts()) {
			int balance = account.getBalance();
			
			if (balance < 0) {
				amount += balance;
			}
		}
		
		return amount;
	}
	
	public int totalAmount(Client client) {
		int amount = 0;
		
		for (Account account : client.getAccounts()) {
			amount += account.getBalance();
		}
		
		return amount;
	}

}
