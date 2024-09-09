package dppcodes;
import java.util.Scanner;

public class q16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string 1: ");
        String s1 = sc.nextLine();
        
        System.out.println("Enter the first string 2: ");
        String s2 = sc.nextLine();
        
        String s3= s1.concat(s2);
        System.out.println("After Concatenating:\n" + s3);
        
    }
    
}
