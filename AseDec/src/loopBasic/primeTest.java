package loopBasic;

public class primeTest {
    
    public static void main(String[] args) {
        
        int i, j, check = 0, n = 100, count = 0;

        for(i = 2; count < n; i++)
        {
            check = 0;
            
            for(j = 2; j <= i/2; j++)
            {
                if(i%j == 0)
                {
                    check = 1;
                    break;
                }
            }
            if(check == 0)
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count: " + count);
    }
    
}
