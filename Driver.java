package programingAssignment2;

public class Driver 
{
	public static void main(String[] args) 
	{
		double balance = 1330;
		double interestRate = 4.5;
		Customer customer1 = new Customer("Sarah", "Smith", "319 grand ave", 24);
		System.out.println("customer-1: \n" + customer1.toString());
		Customer customer2 = new Customer("John", "Smith", "12 nicollect", 34);
		System.out.println("customer-2: \n" + customer2.toString());
		BankAccount account = new BankAccount(customer1, balance, interestRate);
		
		
		System.out.println("Current Balance: " + account.getBalance());
		account.deposit(200);
		System.out.println("Current Balance: " + account.getBalance());
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Account Created date: " + account.getDate());
		account.getCustomer();
		System.out.println("Customer ID: " + Customer.getID());
		System.out.println("Monthly Inerest Rate: " + account.getMonthlyInterestRate());
		System.out.println("Monthly Interest: " + account.getMonthlyInterest());
		System.out.println("Current Balance: " + account.getBalance());
		account.withdraw(300);
		System.out.println("Monthly Interest: " + account.getMonthlyInterest());
		System.out.println("Account-1 toString output: \n" + account.toString());
	
	}
}
