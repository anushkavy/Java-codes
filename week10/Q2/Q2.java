
package week10.Q2;

public class Q2 {

   
    public static void main(String[] args) {
        Edible e = new Edible();
        Edible.Fruit f = new Edible.Fruit("Orange, Strawberry, Apple, Mango, Papaya", "Orange, Red, Yellow");
        Edible.Vegetable v = new Edible.Vegetable("Brinjal, Okra, Potato", "Purple, Green, Brown");
        
        f.fruitDetails();
        f.fruitPackaging();
        System.out.println("");
        
        v.vegetableDetails();
        v.vegetablePackaging();
    }
    
}
