package week4;

import java.util.Scanner;

public class Week4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of your array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        //Feeding the elements in array
        for(int i=0; i<n;i++){
            arr[i]= (i+1)*10;
        }
        
        //Displaying the elements
        for(int e:arr){
            System.out.println(e);
        }
    }
    
}
