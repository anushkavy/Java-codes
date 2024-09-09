package week4;

import java.util.Scanner;

public class Week4q2 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of your array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        
        System.out.println("Enter the elements of Array: ");
        //Feeding the elements in array
        for(int i=0; i<n;i++){
            System.out.print("Element " + (i+1)+ ":");
            arr[i]= sc.nextInt();
        }
        
        //Calculating sum of each element
        for(int i=0; i<n;i++){
            sum = sum + arr[i];
        }
        
        System.out.println("Sum of all elements = " + sum);
    }
    
}
