
package week8;

public class Week8 {

    public static void main(String[] args) {
        Fruit Apple = new Fruit();
        Apple.setName("Apple");
        Apple.setColor("Red");
        Apple.setTaste("Sweet");
        Apple.setPrice(60);
        Apple.display();
        
        Fruit Orange = new Fruit();
        Orange.setName("Orange");
        Orange.setColor("Orange");
        Orange.setTaste("Tangy");
        Orange.setPrice(100);
        Orange.display();
        
        Fruit Banana = new Fruit();
        Banana.setName("Banana");
        Banana.setColor("Yellow");
        Banana.setTaste("Sweet");
        Banana.setPrice(50);
        Banana.display();
    }
    
}
