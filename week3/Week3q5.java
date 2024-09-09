/*
 Write a Java program to take a number, divide it by 2 and print the result 
until the number becomes less than 10.  
*/
package week3;

import java.util.Scanner;

public class Week3q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
       
        System.out.println("The number divided by 2 are: ");
        while(num>=10){
            System.out.println(num);
            num = num/2;
        }
        
        
    }
    
}
