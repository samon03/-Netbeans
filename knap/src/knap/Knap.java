package knap;

import java.util.Scanner;

public class Knap {

    
    public static void main(String[] args) {
       
        Scanner scn =new Scanner(System.in);
        int t = scn.nextInt();
        
        int i, j, k, p = 0, s = 0, check, lowest = 0, sum = 0;
        
        int flag = 0;
        
        int[] arr = {5, 10, 1, 1, 3};
        int[] pArr = new int[5];
        int[] nArr = new int[5];
        int[] cash = new int[]{};
        int[] low = new int[]{};
        
        
        for(i = 0; i < t; i++)
        {
            for(j = 0; j < 5; j++)
            {
                pArr[j] = scn.nextInt();
//                System.out.print(pArr[j] + " ");
            }
            for(k = 0; k < 5; k++)
            {
                nArr[k] = scn.nextInt();
//                System.out.print(nArr[k]+ " ");
            }
            
            p = scn.nextInt();
            s = scn.nextInt();
        }
        
         // find lowest
       
        lowest = nArr[0]/arr[0]; 
        int x = 0;
        
        for(int a = 0; a < arr.length; a++)
        {
            check = nArr[a]/arr[a];
            System.out.printf(check + " ");
            if(check < lowest)
            {
                lowest = check;
                low[x] = lowest;
                System.out.println(low[x]);
                x++;
//                nArr[a] *= 2; 
//                cash[x] = a;
//                x++;
//                flag = flag + (nArr[a] * pArr[a]);

            }
            System.out.println(low[a]);
        }
              
//           for(int b = 0; b < cash.length; b++)
//         {  
//             if(b == cash[b])
//             {
//                 flag = flag + (nArr[b] * pArr[b]);
//                 System.out.println(flag);
//             }
//            
//         }
//         
//         
//         if(flag <= p)
//         {
//             System.out.println("Sum: " + flag);  
//         }
        
        
    }
    
}
