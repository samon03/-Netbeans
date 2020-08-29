package Dom1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Try {
    public static void main(String[] args){  
          String str;
          Scanner scn = new Scanner(System.in);
          str = scn.nextLine();  
          int total = 0;
          int count=0, size= 0;
          do
          {
               char name[] = str.toCharArray();
               size = name.length;
               count = 0;
               for(int j=0; j < size; j++)
               {
                    if((name[0] == name[j]) && ((name[0] >= 65 && name[0] <= 91)))
                    count++;
               }
               if(count!=0)
               {
                   if(count > 1){
                      count = 1;  
                   }
                   total = total + count;
                   str = str.replace(""+name[0],"");    
                } 
          } 
          while(size != 0);
          int rem = 26 - total;
          System.out.println(rem);
    }  
}
