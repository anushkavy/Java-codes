//Write a Java program to calculate the sum of following series: 
//1 + 2 + 3 + 4 + .......... + N 

package week3;

import java.util.Scanner;

public class Week3q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number of the series to calculate its sum: ");
        int n = sc.nextInt();
        int sum=0;
        
        for(int i=1 ; i<=n ; i++){
           sum = sum+i;
        }
        
        System.out.println("The sum of series is: " + sum);
    }
    
}
