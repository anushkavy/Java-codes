package dppcodes;

import java.util.Scanner;

public class q31 {
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
        
        //Bubble Sort
        for(int i=0; i<n-1;i++){
            boolean isSorted = true;
            for(int j=0; j<n-1-i; j++){
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
        
        System.out.println("Array after Bubble Sorting: ");
        for(int e:arr){
            System.out.print(e + "\t");
        }
        
    }
    
}
