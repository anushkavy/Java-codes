package week4;

import java.util.Scanner;

public class Week4q6 {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial: ");
        int n = sc.nextInt();
        
        int fact =1;
        
        for(int i=2; i<=n; i++){
            fact = fact*i;
        }
        
        System.out.println("Factorial of number = " + fact);
    }
    
}