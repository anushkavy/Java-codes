/*
 Create class Edible. Within that define two static classes Fruit and Vegetable. 
Fruit class will have two methods- fruitDetails() is a static method and 
fruitPackaging() is a non-static method. Vegetable class also has similar 
methods - vegetableDetails() and vegetablePackaging(). Call all the four 
methods from main method.
 */

package week10.Q2;
public class Edible {
    
    static class Fruit{
        
        private static String Names;
        private static String Colors;
        
   

        public Fruit(String N, String C) {
            Names = N;
            Colors = C;
        }
        
        public static void fruitDetails(){
            System.out.println("Some Fruit Names: " + Names);
             System.out.println("Some Fruit Colors: " + Colors);    
        }
        
        public void fruitPackaging(){
            System.out.println("This is the non static fruit packaging method.");
        }
        
    }
    
    static class Vegetable{
         private static String Names;
        private static String Colors;
        
   

        public Vegetable(String N, String C) {
            Names = N;
            Colors = C;
        }
        
        public static void vegetableDetails(){
            System.out.println("Some Vegetable Names: " + Names);
             System.out.println("Some Vegetable Colors: " + Colors);    
        }
        
        public void vegetablePackaging(){
            System.out.println("This is the non static vegetable packaging method.");
        }
    }
    
}

