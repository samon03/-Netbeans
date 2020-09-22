
package string;

public class revString {
    
    public static void main(String[] args) {
        
        String str = "cats and dogs";
        String rev = "";
        
        char ch[] = str.toCharArray();
        int len = ch.length;
        
        for(int i = len-1; i >= 0; i--)
        {
            rev = rev + ch[i];
        }
        
        System.out.println(rev);
       
    }
    
}
