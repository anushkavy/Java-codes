package dppcodes;

import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int arr[] = new int[size];
        
        System.out.println("Enter " + size + " elements of Array: ");
        for(int i=0; i<size;i++){
            System.out.println("Element "+ (i+1)+":");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Elements of array are: ");
        for(int e:arr){
            System.out.println(e);
        }
        
    }
    
}
