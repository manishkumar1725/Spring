package com.manish.q3;

public interface BankAccountRepository 
{
	
	public double getBalance(long accountId);
	
	public double updateBalance(long accountId,long newBalance);

}
