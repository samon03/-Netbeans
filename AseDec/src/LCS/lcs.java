package LCS;

import java.util.Scanner;

public class lcs {
        
        public static int LCSLength(String X, String Y, int m, int n)
   	{
            if(m == 0 || n == 0)
            {
                return 0;
            }
            
            if(X.charAt(m-1) == Y.charAt(n-1))
            {
                return LCSLength(X, Y, m - 1, n - 1)+1;
            }
            
            return Integer.max(LCSLength(X, Y, m, n - 1), 
                    LCSLength(X, Y, m - 1, n));
		
	}

	public static void main(String[] args)
	{
	    Scanner scn = new Scanner(System.in);
            
            String X = scn.nextLine();
            String Y = scn.nextLine();
            
            System.out.println("LCS Length: " + LCSLength(X, Y, X.length(), Y.length()));
	}
}
