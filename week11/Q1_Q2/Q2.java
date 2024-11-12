
package week11.Q1_Q2;

public class Q2 {

   
    public static void main(String[] args) {
        Saving s_acc = new Saving();
        Current c_acc = new Current();
        
        s_acc.deposit();
        s_acc.withdraw();
        s_acc.takeLoan();
       
        
        System.out.println("");
        
        c_acc.deposit();
        c_acc.withdraw();
        c_acc.takeLoan();
        
        System.out.println("");
        
        Account.aboutBank();
    }
    
}
