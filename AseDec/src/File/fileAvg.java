/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Samon
 */
public class fileAvg {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        File in = new File("input.txt");
        Scanner file = new Scanner(in);
        
        DecimalFormat dv = new DecimalFormat("000.00");
        DecimalFormat av = new DecimalFormat("0.00");
        
        
        double amount, total = 0, count = 0, avg; 
        
        while(file.hasNext())
        {
            amount = file.nextDouble();
            total += amount;
            
            if(amount != 0)
            {
                count++;
            }
            
        }
        
        avg = total/count;
        
        System.out.println(dv.format(total));
        System.out.println(av.format(avg));
        
    }
}
