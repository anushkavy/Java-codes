package week4;

import java.util.Scanner;

public class Week4q4 {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        
        double sum=0;
        
        for(int i=1 ; i<=n; i++){
            sum = sum + (1.0/i);
            
        }
        
        System.out.println("Sum of series = " + sum);
    }
    
}