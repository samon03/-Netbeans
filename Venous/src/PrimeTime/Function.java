package PrimeTime;

import java.util.*; 
import java.lang.Math.*;
 
class Function {  
  String PrimeTime(int num) { 
 
    for (int i = 2; i < Math.sqrt(num); i++){
      if (num % i == 0){
        return "false";
      }
    }
        
    return "true";
     
  }      
}
