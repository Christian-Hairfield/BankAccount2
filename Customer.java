/*-----------------------------------------------------------------
 * Override equals method. 
 * This method should return true if the calling object is equal to the other object
 * -----------------------------------------------------------------
 */

package programingAssignment2;


public class Customer 
{
	private static String firstName;
	private static String lastName;
	private static String Address;
	private static int age;
	private static int ID;
	
	
	//accessor and mutator for age
	public static int getage() 						{ return age; 					}
	public void setage(int age)					{ Customer.age = age; 				}
	
	//accessor and mutator for firstname
	public static String getfirstName() 				{ return firstName;				}
	public void setfirstName(String firstName) 	{ Customer.firstName = firstName; 	}
	
	//accessor and mutator for lastname
	public static String getlastName() 				{ return lastName; 				}
	public void setlastName(String lastName)	{ Customer.lastName = lastName; 	}
	
	//accessor and mutator for address
	public static String getaddress() 					{ return Address; 				}
	public void setaddress(String Address) 		{ Customer.Address = Address; 		}
	
	//accessor and mutator for ID
	public static int getID()	
	{ 
		return ID; 
	}
	public void setID(int ID) 
	{ 		
	if (ID == 0)
	{ 
		ID = 32000;
	}
	else 
	{ 
		ID = ID+10; 
	} 
	Customer.ID = ID;
	}
	
	//constructor
	public Customer(String firstName, String lastName, String Address, int age)
	{
		setfirstName(firstName);
		setlastName(lastName);
		setaddress(Address);
		setage(age);
		setID(ID);
	}
	//tostring
	public String toString() {

		String CustomerInfo = "Customer [ID = " + ID
							+ "\n\t\tFirstname: "  + firstName
							+ "\n\t\tLastname: " + lastName
							+ "\n\t\tAge: " 	 + age
							+ "\n\t\tAddress: "  + Address + " ]\n";
							
		return CustomerInfo;
	}
}
