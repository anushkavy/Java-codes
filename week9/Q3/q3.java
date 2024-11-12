
package week9.Q3;

import week9.Q3.Account;


public class q3 {


  
    public static void main(String[] args) {
        double p = 10000;
        double t = 3.5;
        
        Account a = new Account();
        a.deposit();
        a.withdraw();
        double si = a.calculateSimpleInterest(p , t);
        System.out.println("Simple Interest on rupees "+ p + " for " + t + " years is "+ si);
        
        double ci = a.calculateCompoundInterest(p , t);
        System.out.println("Amount compounded annually on rupees "+ p + " for " + t + "years is "+ ci);
        
    }
    
}
