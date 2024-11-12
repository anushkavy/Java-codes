
package week9.Q4;

public class Current extends Account {
    
    private double Max_withdrawl_limit;

    public Current(double Max_withdrawl_limit, int Id, String Account_holder_name, String Address) {
        super(Id, Account_holder_name, Address);
        this.Max_withdrawl_limit = Max_withdrawl_limit;
    }

    
     public void deposit(){
        System.out.println("This is the deposit method of Current account class.");
    }
    public void withdraw(){
        System.out.println("This is the withdraw method of Current account class.");
    }
    
    public void display(){
        System.out.println("Id: " + super.getId());
        System.out.println("Account Holder Name: " + super.getAccount_holder_name());
        System.out.println("Address: " + super.getAddress());
        System.out.println("Maximum Withdrawal Limit: " + this.Max_withdrawl_limit);
    }
}
