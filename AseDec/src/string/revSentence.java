
package string;

public class revSentence {
    
    public static void main(String[] args) {
        String str = "cats and dogs";
        
        String arr[] = str.split("\\s+");
        
        int len = arr.length;
        
        for (int i = len - 1; i >= 0; i--) 
        {
            System.out.printf(arr[i] + " ");
        }
    }
    
}
