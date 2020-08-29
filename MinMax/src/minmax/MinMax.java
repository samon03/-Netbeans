package minmax;

public class MinMax 
{
    public static void main(String[] args) 
    {
        int arr[] = {11, 7, 3, 9, 20, 18, 95, 24};
        
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
//        System.out.printf("largest: " + largest + " smallest: " + smallest);
        for(int i = 0; i < arr.length; i++)
        {
            if(largest < arr[i])
            {
                largest = arr[i];
            }
            else if(smallest > arr[i])
            {
                smallest = arr[i];
            }
        }
        System.out.println("Minimum : " + smallest);
        System.out.println("Maximum : " + largest);
    }    
}
