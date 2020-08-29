package prime;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int i, flag = 0;
      for(i = 2; i <= Math.sqrt(n); i++){
        if(n%i ==  0){   
          flag = 0;
        } else {   
          flag = 1;
        }
      }
      if(flag == 1){   
      System.out.printf(n + " is a prime number");  
     }  
     else{      
       System.out.printf(n + " isn't a prime number");  
     } 
  }
    
}
