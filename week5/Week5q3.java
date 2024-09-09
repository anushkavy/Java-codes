package week5;

import java.util.Scanner;

public class Week5q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the array elements: ");
        
        for(int i=0 ; i<n; i++){
            System.out.println("Element "+ (i+1)+": ");
            arr[i] = sc.nextInt();
        }
        
        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;
        
        System.out.println("Array after swapping first and last elements: ");
        for(int e:arr){
            System.out.print(e+ "\t");
        }
    }
    
}
