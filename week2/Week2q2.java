package week2;

import java.util.Scanner;

public class Week2q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        
        double multiply = num1*num2;
        System.out.println("The multiplication of "+ num1 + " and " + num2 + " is " + multiply);
    }
    
}
