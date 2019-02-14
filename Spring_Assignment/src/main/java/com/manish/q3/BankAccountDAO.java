package com.manish.q3;

import java.util.ArrayList;

public class BankAccountDAO {

	
	ArrayList<BankAccount> list;
	
	public BankAccountDAO()
	{
		
		list = new ArrayList<>();
		
		list.add(new BankAccount(1,"MANISH","SAVING",3000));
		list.add(new BankAccount(2,"RISHAV","CURRENT",4000));
		list.add(new BankAccount(3,"AMIT","SAVING",5000));
	}
	
	
	public ArrayList<BankAccount> getBankUserList()
	{
		return list;
	}

}
