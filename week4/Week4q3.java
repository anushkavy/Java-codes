
package week4;


public class Week4q3 {

    public static void main(String[] args) {
        int n = 5;
        
        //Loop to iterate rows
        for(int i=1; i<=n;i++){
            
            //Loop to print spaces
            for(int j=n; j>i ; j--){
                System.out.print(" ");
            }
            
            //Loop to print numbers in ascending form
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }
            
            //Loop to print numbers in descending order
            for(int m=(i-1); m>0; m-- ){
                System.out.print(m);
            }
            
            //To change to next line
            System.out.println("");
        }
        
        
    }
    
}
