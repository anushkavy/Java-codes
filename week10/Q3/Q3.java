
package week10.Q3;


public class Q3 {
    
    public static void minMaxAdd(int a, int b){
        int max = Math.max(a, b);
        int min = Math.min(a,b);
        int sum = a + b;
        
        System.out.println("Max= " + max);
        System.out.println("Min= " + min);  
        System.out.println("Sum (Add)= " + sum);
    }
    
     public static void minMaxAdd(double a, double  b){
        double  max = Math.max(a, b);
        double  min = Math.min(a,b);
        double  sum = a + b;
        
        System.out.println("Max= " + max);
        System.out.println("Min= " + min);  
        System.out.println("Sum (Add)= " + sum);
    }
     
      public static void minMaxAdd(char a, char b){
        
        char min = (char) Math.min(a, b);
        char max = (char) Math.max(a, b);
        int sum = a + b; 
     
        System.out.println("Minimum (by ASCII): " + min);
        System.out.println("Maximum (by ASCII): " + max);
        System.out.println("Addition (ASCII sum): " + sum);
    }
     

    
    public static void main(String[] args) {
        minMaxAdd(34, 43);
        System.out.println("");
        minMaxAdd(45.5, 65.5);
        System.out.println("");
        minMaxAdd('u', 'a');
    }
    
}
