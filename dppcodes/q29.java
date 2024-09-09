package dppcodes;

import java.util.Scanner;
public class q29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of First Matrix: ");
        int rowSize = sc.nextInt();
        System.out.println("Enter the number of columns of First Matrix: ");
        int columnSize = sc.nextInt();
        System.out.println("Enter the number of columns of the Second Matrix: ");
        int columnSizeTwo = sc.nextInt();
        
        int a[][] = new int[rowSize][columnSize];
        int b[][] = new int[columnSize][columnSizeTwo];
        int product[][] = new int[rowSize][columnSizeTwo];
        
        System.out.println("Enter the " + rowSize*columnSize + " elements of First Array: ");
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<columnSize ; j++){
                System.out.println("["+i+"]["+j+"] Element: ");
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter the " + columnSize*columnSizeTwo + " elements of Second Array: ");
        for(int i=0; i<columnSize; i++){
            for(int j=0; j<columnSizeTwo ; j++){
                System.out.println("["+i+"]["+j+"] Element: ");
                b[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("First Array: ");
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<columnSize ; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("Second Array: ");
        for(int i=0; i<columnSize; i++){
            for(int j=0; j<columnSizeTwo ; j++){
                System.out.print(b[i][j]+ "\t");
            }
            System.out.println("");
        }
        
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<columnSizeTwo ; j++){
                int prod = 0;
                for(int k =0; k<columnSize; k++){
                    prod= prod + a[i][k]* b[k][j];
                }
                product[i][j]=prod;
            }
        }
        
        System.out.println("Multiplied Array: ");
        for(int i=0; i<rowSize; i++){
            for(int j=0; j<columnSizeTwo ; j++){
                System.out.print(product[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}
