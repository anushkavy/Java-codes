package dppcodes;

import java.util.Scanner;

public class q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int arr[] = new int[size];
        
        System.out.println("Enter " + size + " elements of Array: ");
        for(int i=0; i<size;i++){
            System.out.println("Element "+ (i+1)+":");
            arr[i] = sc.nextInt();
        }
        
        
        for(int i=0; i<size; i++){
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(arr[i]);j++){
                if(arr[i]%j==0){
                    isPrime = false;
                    System.out.println(arr[i] + " is not a Prime number.");
                    break;
            }
        }
            if(isPrime)
                System.out.println(arr[i]+ " is a Prime number.");
        }

        
    }
    
}
