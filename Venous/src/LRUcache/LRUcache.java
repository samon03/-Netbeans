package LRUcache;


public class LRUcache {
    public static void main(String[] args) {
        
      String[] str = {"A", "B", "C", "D", "E", "A", "Z"}; // output: C-D-E
      String[] cache = new String[100]; 
      
      int len = str.length; 
      int cachelen = cache.length; 
      int count = 0;
      String s = "";  
      //      System.out.println(cachelen);      
      for(int i = 1; i < len; i++)
      {    
           for(int j = i-1; j < len; j++)
           {    
//               if(count < 10)           
//               {        
               if(str[i] != str[j])
               {
                   cache[i] = str[i];
                   s += cache[i] + "-";  


               }
//                   count++;      



//               }
           }
       }  
       System.out.println(s);

    }


}
