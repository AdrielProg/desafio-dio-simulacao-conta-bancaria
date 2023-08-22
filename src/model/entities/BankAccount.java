package model.entities;

public class BankAccount {
	private Integer number;
	private String bankBranch;
	private String clientName;
	private Double balance;

	public BankAccount(Integer number, String bankBranch, String clientName, Double balance) {
		this.number = number;
		this.bankBranch = bankBranch;
		this.clientName = clientName;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return clientName + " " 
	          + "obrigado por criar uma conta em nosso banco, sua agência é "
	          + bankBranch	+ ", conta \n" + number 
	          +" e o seu saldo e de: " + String.format("%.2f", balance) + " R$ já está disponível para saque" ;
	}
	
	

}
