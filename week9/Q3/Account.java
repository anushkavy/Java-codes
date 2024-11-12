/*
 Create class Account (Data members- Id, Account_holder_name, Address; 
Methodsdeposit(), withdraw()). Create two static methods in Account 
calculateSimpleInterest() and calculateCompoundInterest() and implement 
them.  */
package week9.Q3;

public class Account {
    private int Id;
    private String Account_holder_name;
    private String Address;
    private static double rate = 5;
    
  
    
    public void deposit(){
        System.out.println("This is the deposit method of account class.");
    }
    
    public void withdraw(){
        System.out.println("This is the withdraw method of account class.");
    }
    
    public static double calculateSimpleInterest(double p, double t){
        double SI = (p* rate * t)/100;
        return SI;
    }
    
    public static double calculateCompoundInterest(double p, double t){
        double A = p*(Math.pow((1 + rate), t));
        return A;
    }
}
