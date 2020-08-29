package Missing_Num;

public class Missing_Num 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello World");
        
         int[] a={1,2,3,4,5,7,8,10};
         int i,j,c;
         for(i=1;i<a.length;i++)
         {
           if((a[i]-a[i-1])!=1)
           {
               c=a[i]-1;
               System.out.println(" Missing element is : "+ c);
           }
         }

   }
    
}
