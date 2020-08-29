
package DistinctList;

import java.util.Scanner;

public class Main {
    
    public static int Distinct(int[] arr) {
       
        int[] distinct = new int[100]; 
        
        for(int i = 0; i < arr.length; i++){
          int n = arr[i];
          if(distinct[n] == -1){
             distinct[n] = arr[i];
          }
        }
        return arr.length - distinct.length;
    }
    public static void main(String[] args) {
         
//       Scanner s = new Scanner(System.in);
       System.out.println(Distinct(new int[]{4, 6, 7, 2}));
    }
}
