package dppcodes;

import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the last number of series: ");
       int N = sc.nextInt();
       
       int sum=0;
       
       for(int i=1; i<=N; i++){
           sum = sum+i;
       }
       System.out.println("Sum: "+sum);
    }
    
}
