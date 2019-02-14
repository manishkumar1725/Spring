package com.manish.q1;

public class Customer 
{
  int customerId;
  String customerName;
  String customerContact;
  Address customerAddress;
  
  
public Customer(int customerId, String customerName, String customerContact,Address customerAddress) 
{
    this.customerId = customerId;
	this.customerName = customerName;
	this.customerContact = customerContact;
	this.customerAddress = customerAddress;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public String getCustomerContact() {
	return customerContact;
}
public void setCustomerContact(String customerContact) {
	this.customerContact = customerContact;
}

public Address getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(Address customerAddress) {
	this.customerAddress = customerAddress;
}
  
  
public void show()
{
	System.out.println(+getCustomerId()+"-"+getCustomerName()+"-"+getCustomerContact()
			+"-"+getCustomerAddress().getStreet()+"-"+getCustomerAddress().getCity()+"-"		
			+getCustomerAddress().getZip()+"-"+getCustomerAddress().getState()+"-"+
			getCustomerAddress().getCountry()
	);
}
	
}
