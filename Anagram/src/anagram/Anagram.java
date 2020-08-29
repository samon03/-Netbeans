package anagram;

import java.util.Arrays;


public class Anagram {

   public static void main(String[] args) 
    {
       int str1[] = {'l', 'i', 's', 't', 'e', 'n'};
       int str2[] = {'s', 'i', 'l', 'e', 'n', 't'};
       
       int n1 = str1.length;
       int n2 = str2.length;
       
       Arrays.sort(str1);
       Arrays.sort(str2);
       
       int flag = 0;
       
       for(int i = 0; i < n1; i++)
       {
           if(n1 == n2)
           {
               if(str1[i] == str2[i])
               {
                   flag++;
                  // System.out.println(flag);
               }
           }     
       }
       if(flag == n1)
       {
           System.out.println("Anagram");
       }
       else
       {
          System.out.println("Not Anagram"); 
       }
       
    }   
}
