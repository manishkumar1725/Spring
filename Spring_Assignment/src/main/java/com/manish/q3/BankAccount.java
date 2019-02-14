package com.manish.q3;

import java.util.stream.Stream;

public class BankAccount 
{
	
	long accountId;
	String accountHolderName;
	String accountType;
	long accountBalance;
	
	public BankAccount(int accountId, String accountHolderName,String accountType, long accountBalance) 
	{
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	
	
   //GETTERS AND SETTERS...
	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}


	
	
	
	

}
