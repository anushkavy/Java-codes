package week6;

import java.util.Scanner;


public class week6q6 {
    
    public static int fact(int n){
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int factorial = fact(n);
        
        System.out.println("The facotrial of "+ n + " is: "+ factorial);
    }
    
}
