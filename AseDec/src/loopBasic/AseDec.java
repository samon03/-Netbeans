package loopBasic;

public class AseDec {
    
    public static void rev(int n)
    {
        if(n == 1)
        {
            n++;
        }
        if(n > 1 && n <= 10)
        {
            System.out.printf("%d ", n);
            rev(n+1);
            
        }
    }

    public static void main(String[] args) {
       
        int i;
        for(i = 10; i >= 1; i--)
        {
            System.out.printf("%d ", i);
            if(i == 1)
            {
                rev(i);
            }
        }
    }
    
}
