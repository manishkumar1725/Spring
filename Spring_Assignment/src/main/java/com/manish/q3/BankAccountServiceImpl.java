package com.manish.q3;

import java.util.ArrayList;

public class BankAccountServiceImpl implements BankAccountService
{
    BankAccountDAO dao = new BankAccountDAO();
	
	ArrayList<BankAccount> acc = dao.getBankUserList();
	
	@Override
	public long withdraw(long accountId, long balance) 
	{
	
      long remainingBalance=0;
      
      for(BankAccount index : acc)
      {
    	  if(index.getAccountId()== accountId )
    	  {
    		  if( balance <= index.getAccountBalance())
    	    {
    		  remainingBalance = remainingBalance + index.getAccountBalance() - balance;
    	    }
    		  else
    			  System.out.println("Amount Cannot be Withdrawn!!");
           }
      }
      return remainingBalance;
      
	}
	@Override
	public long deposit(long accountId, long balance) 
	{
		
		long remainingBalance = 0;
		
		for(BankAccount index : acc)
	    {
	    	if(index.getAccountId()== accountId)
	    	{
	    		remainingBalance= index.getAccountBalance()+balance;
	    	}
	    }
	    return remainingBalance;
	}

	@Override
	public long getBalance(long accountId) 
	{
        long Balance = 0;
		
		for(BankAccount index : acc)
	    {
	    	if(index.getAccountId()== accountId)
	    	{
	    		Balance= Balance + index.getAccountBalance();
	    	}
	    }
	    return Balance;
	
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, long amount) 
	{   
		boolean transfer = false;
		for(BankAccount index : acc)
		{
			if(index.getAccountId() == fromAccount)
			{
				if(amount < index.getAccountBalance())
			{
				transfer = true;
			}
			else
				transfer =false;
		}
		}
		return transfer;
	

}
}