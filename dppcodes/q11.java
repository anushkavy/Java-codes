package dppcodes;

import java.util.Scanner;

public class q11 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the number: ");
       int num = sc.nextInt();
       
       System.out.println("How many times do you want to repeat it?");
       int N = sc.nextInt();
       
       for(int i=0; i<N; i++){
           System.out.println((i+1)+". "+num);
       }
    }
    
}
