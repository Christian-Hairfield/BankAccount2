package programingAssignment2;
import java.util.Date;
import java.util.Random;

public class BankAccount 
{
	private double balance, annualintrestrate, monthlyintrestrate, monthlyintrest, interestRate;
	private Date date;
	static private long accountNumber;
	private Customer customer;
	Random Rand = new Random();
	
	public  long generateaccountNumber() {
		accountNumber = Rand.nextInt(900000000);
		return accountNumber;
	}	
	//Constructor
	public BankAccount(Customer customer1, double balance, double interestRate) {
		accountNumber = generateaccountNumber();
		setBalance(balance);
		setAnnualintrestrate(interestRate);
		date = new Date();
		customer = customer1;
	}
	//accessor and mutator for Balance
	public double getBalance() { 
		return balance; 
	}
	public void setBalance(double balance){ 
		this.balance = balance; 
	}	
	//accessor and mutator for AnnualIntrestRate
	public double getAnnualintrestrate(){ 
		return annualintrestrate; 
	}
	public void setAnnualintrestrate(double annualintrestrate){ 
		this.annualintrestrate = annualintrestrate; 
	}	
	//accessor and mutator for Date
	public Date getDate(){ 
		return date; 
	}
	public void setDate(Date date)	{ 
		this.date = date; 
	}
	//accessor for Account Number
	public long getAccountNumber() { 
		return accountNumber; 
	}	
	//accessor for Monthly Interest Rate
	public double getMonthlyInterestRate() { 
		monthlyintrestrate = annualintrestrate/12; 
		return monthlyintrestrate; 
	 }	
	//accessor for Monthly Interest
	public double getMonthlyInterest() {
		monthlyintrest = balance *monthlyintrestrate;
		return monthlyintrest;
	}	
	//accessor and mutator for interest Rate
	public double getinterestRate() {
		return interestRate;
		}
	public void setinterestRate(double interestRate) { 
		this.interestRate= interestRate; 
		}
	//deposit method
	public void deposit(double deposit) {
		if (deposit < 0) {
			System.out.println("Deposit was less than 0");
			System.exit(1);
		}
		double newtotalbalance = balance + deposit;
		balance = newtotalbalance;
	}
	
	//withdraw method 
	public void withdraw(double withdraw) {
		if (withdraw < 0 || withdraw > balance) {
			System.out.println("Withdraw was less than 0 or greater than the current account balance.");
			System.exit(1);
		}
		double newtotalbalance = balance - withdraw;
		balance = newtotalbalance;
	}
	public String toString() {
		String BankAccountInfo = "Bank Account [ \n\t\tBalance: $" + balance
								+ "\n\t\tDate: " + date + "\n\t\tAccountNumber: " 
								+ accountNumber + "\n\t\tInterestRate: " 
								+ annualintrestrate + "\n\t\tCustomer [ID = " + Customer.getID()
								+ "\n\t\tFirstname: "  + Customer.getfirstName()
								+ "\n\t\tLastname: " + Customer.getlastName()
								+ "\n\t\tAge: " 	 + Customer.getage()
								+ "\n\t\tAddress: "  + Customer.getaddress() + " ]\n";
		return BankAccountInfo;
		}

	public Customer getCustomer() 
	{
		return customer;
	}
	
}
