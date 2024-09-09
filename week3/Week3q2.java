package week3;

import java.util.Scanner;

public class Week3q2 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        
        System.out.println("Enter the third number: ");
        int c = sc.nextInt();
        
        int largest = a;
        
        if(b>largest){
            if(c>b){
                System.out.println(c + " is the largest.");
            }
            else{
                System.out.println(b + " is the largest.");
            }
        }
        else if( c>largest){
                System.out.println(c + " is the largest.");
        }
        else{
            System.out.println(a + " is the largest.");
        }
    }
    
}
