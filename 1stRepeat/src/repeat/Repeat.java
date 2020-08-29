package repeat;

public class Repeat 
{
    public static void main(String[] args) 
    {
        String s = "edfed";
        String s1 = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s1.length(); i++) 
        {
            for (int j = i + 1; j < s1.length(); j++) 
            {
                if (s1.charAt(i) == s1.charAt(j)) 
                {
                  count++;
                }
            }
            if(count != i+1)
            {
                System.out.println("The first non repeated character is: "+s1.charAt(count));
                break;
            }
        }
    }
    
}
