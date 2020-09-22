
package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class fileSum {
    
     public static void main(String[] args) throws FileNotFoundException {
        
        File in = new File("input.txt");
        Scanner file = new Scanner(in);
        
        DecimalFormat dv = new DecimalFormat("000");
        
        int amount, sum = 0; 
        
        while(file.hasNext())
        {
            amount = file.nextInt();
            sum += amount;
        }
        
        System.out.println(dv.format(sum));;
        
    }
    
}
