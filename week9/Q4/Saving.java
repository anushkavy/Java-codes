
package week9.Q4;

/**
 *
 * @author Anushka
 */
public class Saving extends Account{
    
    private double Min_balance; 

    public Saving(double Min_balance, int Id, String Account_holder_name, String Address) {
        super(Id, Account_holder_name, Address);
        this.Min_balance = Min_balance;
    }
    
    public void deposit(){
        System.out.println("This is the deposit method of Saving account class.");
    }
    public void withdraw(){
        System.out.println("This is the withdraw method of Saving account class.");
    }
    
    public void display(){
        System.out.println("Id: " + super.getId());
        System.out.println("Account Holder Name: " + super.getAccount_holder_name());
        System.out.println("Address: " + super.getAddress());
        System.out.println("Mininum Balance: " + this.Min_balance);
    }
}
