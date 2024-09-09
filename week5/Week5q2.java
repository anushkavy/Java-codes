
package week5;

import java.util.Scanner;

public class Week5q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if((n%i)==0)
                isPrime=false;
            
            if(!isPrime)
                break;
                
        }
        
        if(isPrime)
            System.out.println(n + " is a Prime number.");
        else
            System.out.println(n + " is not a Prime number.");
        
        
    }
    
    
}
