package by.htp.task4.view;

import by.htp.task4.entity.Account;
import by.htp.task4.entity.Client;

public class ClientPrinter {
	
	public void print(Client client) {
		System.out.println("Client:");
		System.out.println(client.getName() + " " + client.getSurname());
		System.out.print("Accounts: ");
		for (Account account : client.getAccounts()) {
			System.out.print(account.getNumber() + " ");
		}
		System.out.println();
	}

}
