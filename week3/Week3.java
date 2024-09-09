package week3;

import java.util.Scanner;

public class Week3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to check if its odd or even: ");
        int num = sc.nextInt();
        
        if(num%2 == 0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
    }
    
}
