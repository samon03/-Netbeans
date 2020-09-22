package loopBasic;

public class fibo {
    
    public static void main(String[] args) {
       
        int f1 = 0, f2 = 1, i;

        for(i = 1; i <= 10; i++)
        {
            System.out.printf(f1 + " ");
            
            int sum = f1 + f2;
            f1 = f2;
            f2 = sum;
            
        }
    }
    
}
