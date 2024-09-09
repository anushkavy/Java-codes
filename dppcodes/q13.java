package dppcodes;

import java.util.Scanner;

public class q13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter a number to convert to binary: ");
       int N = sc.nextInt();
       String binary= "";
       
       while(N>0){
           int rem = N%2;
           binary= rem + binary;
           
           N= N/2;
       }
       
       System.out.println("The binary coversion is: " + binary);
    }
    
}
