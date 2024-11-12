package week11.Q3;

public class BuySomething implements Bike,Scooty {
    
    @Override
    public void offer(){
        System.out.println("50% Diwali Offer");
    }
    
    public void details(){
        Bike.super.details();
        Scooty.super.details();
    }
}
