
package week11.Q3;

public interface Bike {
    public void offer();
    public default void details(){
       System.out.println("Honda Bike worth INR 50,000 in INR 25,000 only"); 
    }
}
