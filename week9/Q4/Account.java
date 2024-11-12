/*
 Create class Account (Data members- Id, Account_holder_name, Address; 
Methodsdeposit(), withdraw()). Declare deposit() and withdraw() as abstract 
methods. Declare Account class as abstract. (Create constructor in Account 
as well). 
Create two children of Account- Saving (Data Members- Min_balance; 
Methodsdisplay(), deposit(), withdraw()) and Current (Data Members- 
        Department of Computer Science/Lab Manual/Under Graduate/CABSMJ-3P01 Page13 
 
Max_withdrawl_limit; Methods-display(),deposit(), withdraw()) . Create 
constructors for both classes. Implementation of deposit() and withdraw() 
should be specific to Saving and Current class. Create objects of Saving and 
Current class and display them. 
 */
package week9.Q4;


public abstract class Account {
    private int Id;
    private String Account_holder_name;
    private String Address;

    public Account(int Id, String Account_holder_name, String Address) {
        this.Id = Id;
        this.Account_holder_name = Account_holder_name;
        this.Address = Address;
    }

    public int getId() {
        return Id;
    }

    public String getAccount_holder_name() {
        return Account_holder_name;
    }

    public String getAddress() {
        return Address;
    }
    
  
    
    public abstract void deposit();
    
    public abstract void withdraw();
    
   
}
