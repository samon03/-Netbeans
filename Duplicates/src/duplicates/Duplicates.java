package duplicates;

import java.util.Arrays;

public class Duplicates {

    public static void main(String[] args) 
    {
        int[] arr={1,2,3,1,1,3,5,5,6,8};
        Arrays.sort(arr);    // 1 1 1 2 3 3 5 5 6 8

        for(int i=1;i<arr.length;i++)
        {
          if(arr[i] == arr[i-1])
          {
             System.out.println("Duplicate = " + arr[i]);
          }
        }  
    }
    
}
