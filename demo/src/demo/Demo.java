package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Demo 
{
    public static void main(String[] args) 
    {
       
        String str, rev = "microsft", rev2 = "tfsorcim"; 
        Scanner scn = new Scanner(System.in);
        str = scn.nextLine();       
                
        if (str.contains(rev) || str.contains(rev2)) {
            System.out.println("We both love Microsoft!");
        }
        else
        {
            System.out.println("Only I love Microsoft!");
        }
    }
}
