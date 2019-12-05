package by.htp.task4.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.task4.entity.Account;
import by.htp.task4.entity.Client;
import by.htp.task4.logic.AccountBalanceComparator;
import by.htp.task4.logic.AccountNumberComparator;
import by.htp.task4.logic.ClientLogic;
import by.htp.task4.view.AccountPrinter;
import by.htp.task4.view.ClientPrinter;

public class Main {

	public static void main(String[] args) {
		
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new Account("132453464564", 123));
		accounts.add(new Account("242444564667", -50, true));
		accounts.add(new Account("122457784667", 300, true));
		Client client = new Client("Ivan", "Ivanov", accounts);
		
		ClientPrinter printer = new ClientPrinter();
		printer.print(client);
		System.out.println();
		
		Collections.sort(client.getAccounts(), new AccountNumberComparator());
		printer.print(client);
		System.out.println();
		
		Collections.sort(client.getAccounts(), new AccountBalanceComparator());
		printer.print(client);
		System.out.println();
		
		ClientLogic logic = new ClientLogic();
		Account account = logic.findAccountByNumber(client, "132453464564");
		AccountPrinter accountPrinter = new AccountPrinter();
		accountPrinter.print(account);
		System.out.println();
		
		int amount = logic.totalAmount(client);
		System.out.println("Total amount = " + amount);
		
	}

}
