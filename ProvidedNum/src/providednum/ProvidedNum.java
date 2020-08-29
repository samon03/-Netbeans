package providednum;

import java.util.Scanner;

public class ProvidedNum {

    public static void main(String[] args) 
    {
        int num[] = {2, 3, 4, 5, 7};
        Scanner obj = new Scanner(System.in);
        int temp = 0;
        System.out.println("Please enter the number you want to find: ");
        int a = obj.nextInt();
        
        for(int i=0;i<num.length;i++) 
        {
            temp = num[i];
            if(a == temp) 
            {
                System.out.println("Yes the provided number is present in the array: "+temp);
//                break;
            }
        }
    }
            
}
