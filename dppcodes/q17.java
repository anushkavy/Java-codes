package dppcodes;

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string 1: ");
        String s1 = sc.nextLine();
        
        System.out.println("Enter the first string 2: ");
        String s2 = sc.nextLine();
        
        boolean s3= s1.equals(s2);
        if(s3)
            System.out.println("Both strings are equal.");
        else 
            System.out.println("Strings are not equal.");
    }
    
}
