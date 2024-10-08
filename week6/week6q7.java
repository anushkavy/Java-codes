package week6;

import java.util.Scanner;

public class week6q7 {
    
    public static int fiboWithRec(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        
        return fiboWithRec(n-1)+fiboWithRec(n-2);
    }
    
    public static void fibonacci(int n){
        System.out.println("The result without recursion is: ");
        int a = 0;
        int b = 1;
        int res = 0;
        System.out.print(a + " " + b + " ");
        for(int i=0; i<n-2; i++){
            res = a+b;
            System.out.print(res + " ");
            a=b;
            b=res;
       
        }
        
        
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The result with recursion is: ");
       for(int i=0; i<n ; i++){
           int res = fiboWithRec(i);
           System.out.print(res + " ");
       }
       System.out.println("");
       fibonacci(n);
    }
    
}
