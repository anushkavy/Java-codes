package week11.Q1_Q2;

public interface Account {
    
    public void deposit();
    public void withdraw();
    public static void aboutBank(){
        System.out.println("This is the static aboutBank fucntion of Account class");
    };
    
    /*Question 2*/
    public default void takeLoan(){
        System.out.println("Default takeLoan method of Account class");}
    
}
