package dppcodes;

import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the first number: ");
       int num1 = sc.nextInt();
       
       System.out.println("Enter the second number: ");
       int num2 = sc.nextInt();
       
       System.out.println("Before Swapping:\n a = "+ num1 + "\n b = " + num2);
       
       int temp=num1;
       num1= num2;
       num2=temp;
       
       System.out.println("After Swapping:\n a = "+ num1 + "\n b = " + num2);
    }
    
}
