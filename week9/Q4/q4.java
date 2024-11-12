
package week9.Q4;


public class q4 {

   
    public static void main(String[] args) {
        Saving saving_acc = new Saving(12000, 101, "Anushka Varshney", "Gular Road");
        Current current_acc = new Current(200000, 102, "Faizah Ali", "House");
        
        saving_acc.display();
        current_acc.display();
    }
    
}
