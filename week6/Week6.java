package week6;

import java.util.Scanner;

public class Week6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        
        System.out.println("Enter the elements of your array: ");
               for(int i=0 ; i<size; i++){
            System.out.println("Element "+ (i+1)+": ");
            arr[i] = sc.nextInt();
        }
        
        //Bubble Sort
        for(int i=0; i<size-1;i++){
            boolean isSorted = true;
            for(int j=0; j<size-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
            if(isSorted)
                break;
        }
        
        for(int e:arr){
            System.out.print(e + " ");
        }
        
        //Binary search
        System.out.println("Enter the number to search: ");
        int num = sc.nextInt();
        int end = size-1;
        int start = 0;
        boolean isFound =false;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(num==arr[mid]){
                System.out.println("Element found at index "+mid);
                isFound = true;
                break;
            }
            else if(num>arr[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        
        if(!isFound)
            System.out.println("Element was not found.");
    }
    
}
