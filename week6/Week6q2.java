
package week6;

import java.util.Scanner;


public class Week6q2 {


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
        
    }
    
}
