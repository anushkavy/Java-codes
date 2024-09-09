
package week5;

import java.util.Scanner;

public class Week5q4 {

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

        int max = arr[0];
        int min = arr[0];
        
        for(int i=1; i<n ; i++){
            if(arr[i]>max)
                max = arr[i];
            
            if(arr[i]< min)
                min = arr[i];
        }
        
        System.out.println("The Maximum element is " + max + " and the Minimum element is " + min);
    }
    
}
