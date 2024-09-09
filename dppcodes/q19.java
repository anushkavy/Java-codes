
package dppcodes;

import java.util.Scanner;

public class q19 {

    public static void main(String[] args) {
        //0- 48 9- 57
        //a-97 z-122
        //A-65 Z-90
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int len = str.length();
        
        int countAl=0;
        int countDig=0;
        int countSp=0;
        
        for(int i=0; i<len; i++){
            int c = str.charAt(i);
            if( (c>=65 && c<=90) || (c>=97 && c<=122))
                countAl = countAl +1;
            else if (c>=48 && c<=57)
                countDig = countDig +1;
            else
                countSp = countSp +1;
            
        }
        System.out.println("Alphabets: " + countAl + "\nDigits: " + countDig + "\n Spaces: "+ countSp);
        
    }
    
}
