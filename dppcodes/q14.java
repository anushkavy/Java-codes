package dppcodes;

import java.util.Scanner;

public class q14 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter a number to find its factorial: ");
       int N = sc.nextInt();
       int fact=1;
       
       for(int i=2; i<=N;i++){
           fact = fact*i;
       }
       
       System.out.println("Factorial: "+ fact);
       
    }
    
}
