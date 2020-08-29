    package js;

    public class Js 
    {
        public static void main(String[] args) 
        {
        int[] array = new int [100];
        int count = 0, temp = 0;
        for(int i=500; i<= 1000; i++)
        {  
            if(count <= 100)
            {
                count++;
                boolean isPrime = true;
                for (int j=2; j<=i/2; j++)
                {
                    if(i%j==0)
                    {
                        isPrime = false;
                        break;
                    }
                } 
                if(isPrime)
                {
                    System.out.println(i);
                    int flag = 501;
                    for(int k = 0; k < array.length; k++)
                    {
                        array[k] = i;
                        if(array[k] == flag)
                        {
                            temp = 1;
                        }
                    }
                }      
            }
        }
        if(temp == 1)
        {
            System.out.println("Number is Found");
        }
        else
        {
            System.out.println("Number is not Found");
        }

        }

    }
