/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;


public class Main {
    public static void main(String[] args) {
       
        int[] arr = {4, 6, 7, 2};
        int[] distinct = new int[10]; 

        for(int i = 0; i < arr.length; i++){
//          int n = arr[i];
          if(distinct[i] == -1){
             distinct[i] = arr[i];
          }
        }
        System.out.println(arr.length - distinct.length);
    }
}
