package dppcodes;

import java.util.Scanner;


public class q10 {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the first number: ");
       int num1 = sc.nextInt();
       
       System.out.println("Enter the second number: ");
       int num2 = sc.nextInt();
       
       System.out.println("Enter the third number: ");
       int num3 = sc.nextInt();
       
       int max = num1;
       
       if(num2>max){
           if(num3>num2)
               System.out.println(num3 + " is the greatest number.");
           else
               System.out.println(num2 + " is the greatest number.");
       }
       else if(num3> max)
           System.out.println(num3 + " is the greatest number.");
       else
           System.out.println(max + " is the greatest number.");
    }
    
}
