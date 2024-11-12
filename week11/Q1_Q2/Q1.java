
package week11.Q1_Q2;


public class Q1 {

    public static void main(String[] args) {
        Saving s_acc = new Saving();
        Current c_acc = new Current();
        
        s_acc.deposit();
        s_acc.withdraw();
       
        
        System.out.println("");
        
        c_acc.deposit();
        c_acc.withdraw();
        
        System.out.println("");
        
        Account.aboutBank();
        
        
    }
    
}
