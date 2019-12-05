package by.htp.task4.entity;

public class Account {
	
	private String number;
	private int balance;
	private boolean blocked;
	
	public Account(String number) {
		this.number = number;
	}
	
	public Account(String number, int balance) {
		this.number = number;
		this.balance = balance;
	}

	public Account(String number, int balance, boolean blocked) {
		this.number = number;
		this.balance = balance;
		this.blocked = blocked;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setStatus(boolean blocked) {
		this.blocked = blocked;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balance;
		result = prime * result + (blocked ? 1231 : 1237);
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (balance != other.balance)
			return false;
		if (blocked != other.blocked)
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", balance=" + balance + ", blocked=" + blocked + "]";
	}

}
