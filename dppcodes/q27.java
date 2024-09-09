package dppcodes;

import java.util.Scanner;

public class q27 {
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
        
        int countEven = 0;
        
        for(int e:arr){
            if(e%2==0)
                countEven = countEven +1;
        }
        
        System.out.println("The number of even elements in array is "+ countEven + " and number of odd elements is: " + (n-countEven));
    }
    
}
