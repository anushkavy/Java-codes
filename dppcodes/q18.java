package dppcodes;

import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse it: ");
        String str = sc.nextLine();
        
        String rev = "";
        int len = str.length();
        int i=0;
        while(i<len){
            char temp = str.charAt(i);
            rev = temp + rev;
            i++;
        }
        
        System.out.println("After reversing: "+rev);
    }
    
}
