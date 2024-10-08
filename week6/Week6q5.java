package week6;

import java.util.Scanner;

public class Week6q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int len = str.length();
        
        boolean isPalindrome = true;
        
        for(int i=0; i<len/2;i++){
            if(str.charAt(i)!= str.charAt(len-i-1)){
                isPalindrome = false;
                System.out.println("Not a Palindrome.");
                break;
            }
        }
        
        if(isPalindrome)
            System.out.println("Is a Palindrome.");
    }
    
}
