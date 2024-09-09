package week2;

import java.util.Scanner;

public class Week2q5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of x1: ");
        double x1 = sc.nextDouble();
        
        System.out.println("Enter the value of x2: ");
        double x2 = sc.nextDouble();
        
        System.out.println("Enter the value of y1: ");
        double y1 = sc.nextDouble();
        
        System.out.println("Enter the value of y2: ");
        double y2 = sc.nextDouble();
        
        double square = (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
        double dist = Math.sqrt(square);
        
        System.out.println("The Distance between ("+ x1 + ", " + x2 + ") and (" + y1 + ", " + y2 + ") is " + dist);
    }
    
}
