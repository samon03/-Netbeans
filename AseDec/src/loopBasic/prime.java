
package loopBasic;

import java.util.Scanner;

public class prime {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int j, check = 0;

        for(j = 2; j <= n/2; j++)
        {
            if(n%j == 0)
            {
                check = 1;
                break;
            }
        }
      
        if(check == 0)
        {
            System.out.println(n + " is a Prime Number");
        }
        else
        {
            System.out.println(n + " is not a Prime Number");
        }
    }  
}  