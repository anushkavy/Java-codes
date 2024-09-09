
package dppcodes;

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the radius of circle: ");
       double radius = sc.nextDouble();
       
       double perimeter = 2*Math.PI*radius;
       double area= Math.PI*radius*radius;
       
       System.out.println("Perimeter: "+ perimeter);
       System.out.println("Area: "+ area);
    }
    
}
