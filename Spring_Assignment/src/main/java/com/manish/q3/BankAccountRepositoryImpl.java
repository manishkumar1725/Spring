package com.manish.q3;

import java.util.ArrayList;

public class BankAccountRepositoryImpl implements BankAccountRepository 
{
	BankAccountDAO dao = new BankAccountDAO();
	
	ArrayList<BankAccount> acc = dao.getBankUserList();
	
	@Override
	public double getBalance(long accountId)
	{
       
		long updateBalance = 0;
		
	    for(BankAccount index : dao.list)
	    {
	    	if(index.getAccountId()== accountId)
	    	{
	    		updateBalance=index.getAccountBalance();
	    	}
	    }
	    
	    return updateBalance;
		
	}

	@Override
	public double updateBalance(long accountId, long newBalance) {
		
		long updateBalance = 0;
	    long  Balance=0;
		for(BankAccount index : acc)
	    {
	    	if(index.getAccountId()== accountId)
	    	{
	    		Balance = newBalance + index.getAccountBalance();
	    		updateBalance = Balance;		
	    	}
	    }
		return updateBalance;
		
		
	}

	
}

