package dppcodes;

import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter an integer: ");
       int N = sc.nextInt();
       int sum=0;
       
       while(N>0){
           int rem = N%10;
           sum = sum+rem;
           N=N/10;
       }
       
       System.out.println("Sum of digits: " + sum);
    }
    
}
