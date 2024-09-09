package week5;

import java.util.Scanner;

public class Week5q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        boolean isFound= false;
        
        System.out.println("Enter the " + size + " elements of Array: ");
        //Loop to input elements from user
        for(int i=0; i<size; i++){
            System.out.println("Element "+ (i+1) + ": ");
            arr[i]= sc.nextInt();
        }
        
        System.out.println("Enter the element to search: ");
        int n = sc.nextInt();
        
        //loop to linearly search the element in array
        for(int i=0; i<size; i++){
            if(arr[i]==n){
                System.out.println("Element Found at " + i + " index.");
                isFound = true;
                break;
            }            
        }
        if(!isFound)
            System.out.println("Element was not found.");
    }
    
}
