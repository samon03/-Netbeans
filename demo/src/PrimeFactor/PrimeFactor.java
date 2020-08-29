/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeFactor;

import java.util.Scanner;

/**
 *
 * @author Samon
 */
public class PrimeFactor {
    
    public static void main(String[] args) {
        String str;
        Scanner scn = new Scanner(System.in);
        str = scn.nextLine();  
        char[] arr = str.toCharArray();
        int flag = 0, count = 0;
        int len = arr.length;
        
        for(int i = 0; i < arr.length; i++)
       {		
            for(int j = i+1; j < arr.length; j++)
            {			
           	if(Character.isUpperCase(arr[i]))
                {
                   if (arr[i] == arr[j])
                      {
                          count++;
                      }
                }
                      
           }
       }
       System.out.println("Total mached: " + count);
       
       int dismatched = len - (count * 2);
       
       System.out.println("dismatched: " + dismatched);
       
       int total = dismatched + count;
       
       System.out.println("Total = dismatched + count: " + total);
       int remanning = 26 - total;

       System.out.println("Remaning: " + remanning);

    }

}
