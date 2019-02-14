package com.manish.q3;

public interface BankAccountService 
{
	public long withdraw(long accountId, long balance);
	
	public long deposit(long accountId, long balance);
	
	public long getBalance(long accountId);
	
	public boolean fundTransfer(long fromAccount, long toAccount, long amount);
	
	
}
