package week2;

import java.util.Scanner;


public class Week2q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its cube: ");
        int num = sc.nextInt();
        int cube= num * num * num;
        System.out.println("The cube of "+ num + " is " + cube);
    }
    
}
