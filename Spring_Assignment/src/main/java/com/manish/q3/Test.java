package com.manish.q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		//BankAccountRepositoryImpl b = new BankAccountRepositoryImpl();
		
		//System.out.println(b.getBalance(1));
		
 //  ApplicationContext context = new ClassPathXmlApplicationContext("third.xml");
   
		
 //  BankAccountService service = (BankAccountService) context.getBean("service");
   
		
	BankAccountServiceImpl service = new BankAccountServiceImpl();
		
   System.out.println("Remaining Balance is:"+service.withdraw(1, 3000));
   
   System.out.println("Updated Balance is:"+service.deposit(1, 4000));
   
   System.out.println("Balance is:"+service.getBalance(1));
   
   System.out.println("Can I Transfer the Amount??"+service.fundTransfer(3,1 , 10000));

}
}