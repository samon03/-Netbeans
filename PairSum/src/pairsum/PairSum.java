package pairsum;

import java.util.ArrayList;

public class PairSum 
{ 
    public static void main(String[] args) 
    {
       int arr[] = {2, 3, 5, 6, 7, 8, 10, -1, -2, -3};
       int sum = 7;
       
       System.out.println("Sum is " + sum);
       System.out.println("--------");
       
       for(int i = 0; i < arr.length; i++)
       {
           int first = arr[i];
           for(int j = i + 1; j < arr.length; j++)
           {
                int second = arr[j];
                if(first + second == sum)
                {
                    System.out.printf("(%d , %d) %n", first , second);
                }
           }
       }
  }
}
