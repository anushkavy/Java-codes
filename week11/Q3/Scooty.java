package week11.Q3;


public interface Scooty {
    public void offer();
    public default void details(){
       System.out.println("Activa worth INR 30,000 in INR 15,000 only"); 
    }
}
