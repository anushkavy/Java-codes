
package week8;

public class Fruit {
    
    private String name;
    private String color;
    private String taste;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getTaste() {
        return taste;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    
    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Taste: " + this.taste);
        System.out.println("Price: " + this.price);

    }
    
    public void setDetails(String name, String color, String taste, int price)
    {
        this.name = name;
        this.color = color;
        this.taste = taste;
        this.price = price;
    }
    
    public Fruit(){
        this.name = "No name";
        this.color = "No color";
        this.taste = "No Taste";
        this.price = 0;
    }
    
    public Fruit(String name){
        this.name = name;
        this.color = "No color";
        this.taste = "No Taste";
        this.price = 0;
    }
    
    public Fruit(String name, int price){
        this.name = name;
        this.color = "No color";
        this.taste = "No Taste";
        this.price = price;
    }
    
    public Fruit(String name, String color, String taste, int price){
        this.name = name;
        this.color = color;
        this.taste = taste;
        this.price = price;
    }
}
