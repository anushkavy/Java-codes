package dppcodes;


import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to generate its multiplication table: ");
        int n = sc.nextInt();
        
        for(int i=1; i<=10; i++){
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }
    
}

