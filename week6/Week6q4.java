package week6;

import java.util.Scanner;

public class Week6q4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int len = str.length();
        String rev = "";
        
        for(int i=0; i<len;i++){
            rev = str.charAt(i)+rev;
        }
        
        System.out.println("The reversed string is: "+ rev);
    }
    
}
