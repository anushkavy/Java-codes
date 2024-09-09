package dppcodes;

import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum=0;
        
        System.out.println("Enter " + size + " elements of Array: ");
        for(int i=0; i<size;i++){
            System.out.println("Element "+ (i+1)+":");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Calculating the sum of all elements...");
        for(int e:arr){
            sum = sum+e;
        }
        
        System.out.println("Sum of all elements is: " + sum);
    }
    
}
