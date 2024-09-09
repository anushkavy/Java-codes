package dppcodes;
import java.util.Scanner;

public class q24 {
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
        
        if(arr[0] ==arr[n-1])
            System.out.println("First and last elements are same, i.e., " + arr[0]);
        else 
            System.out.println("First and last elements are Not same, i.e., " + arr[0] + " and " + arr[n-1]);

    }
    
}
