# BankAccount2
ProgrammingAssignment2 for my CSCI 1082 class at Century college Spring 2020
Design the following two classes:

Account that contains:

balance: double data field

date: Date data field. Use Date class from the java.util package

accountNumber: long data field. You should generate this value randomly. The account number should be 9 digits long. You can use the random method from java Math class.

annualInterestRate: double data field.

customer: customer data field. This is the other class that you will have to design. See description below.

The accessor and mutator methods for balance, annualInterestRate, date, and customer.

The accessor method for accountNumber.

A constructor that creates an account with the specified customer, balance, and interest rate. Also, it should generate the account number and the current date.

A method called getMonthlyInterestRate that returns the monthly interest rate. Monthly Interest Rate is the annualInterestRate / 12.

A method called getMonthlyInterest that returns the monthly interest. Monthly interest is the balance * monthlyInterestRate.

A method called generateAccountNumber that returns a 9 digit number.

A method called deposit that takes a parameter of type double. This method will add the value of the parameter to the balance. Make sure not to accept any negative values.

A method called withdraw that takes a parameter of type double. This method will subtract the value of the parameter from the balance. Make sure not to accept any negative values or values greater than existing balance.

Override toString method. This method should return all the information about this account.

Customer class that contains:

firstName: String data field.

lastName: String data field

address: String data field

age: int data field

The accessor and mutator methods for firstName, lastName, age, and address.

id: int data field. The first customer should have an id of 32000 and for any new customer add 10.

Constructor that creates an customer with the specified first name, last name, address, and age. Also, it should generate the customer’s id.

Override toString method. This method should return all details about this account (firstName, lastName, address, id, and age)

Override equals method. This method should return true if the calling object is equal to the other object.

Write a test program that creates an BankAccount object. Make sure to test all the methods in both the BankAccount and Customer objects.

Note: You don’t have to use Scanner to read the user’s input. It suffice to hard code the values in the driver. Also, make sure that all your mutator (setter) methods validate the inputs.
