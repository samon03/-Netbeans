package palindrome;

import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) 
    {
         String str, rev = "";
         System.out.println("Enter the string : ");
         Scanner scn = new Scanner(System.in);
         str = scn.nextLine();
        
         int len = str.length();
         
         for(int i = len-1; i >= 0; i--)
         {
            rev = rev + str.charAt(i);
         }
         
         if(str.equals(rev))
         {
             System.out.println(str + " is palindrome");
         }
         else
         {
             System.out.println(str + " not palindrome");
         }
    }
    
}
