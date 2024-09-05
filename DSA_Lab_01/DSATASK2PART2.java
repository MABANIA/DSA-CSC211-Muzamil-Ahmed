/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsatask2part2;

/**
 *
 * @author Muzamuil Ahmed
 */
public class DSATASK2PART2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        int [] arr = new int [6];
            arr[0]=100;
          arr[1]=200;
           arr[2]=300;
            arr[3]=400;
              arr[4]=500;
   
       System.out.println("Arrays before insertion");
          for(int i=0;i<arr.length;i++){
               System.out.println("elements at index " +i+":"+arr[i]);
             
          }
     int newelement =250;
     int position =2;
        for(int i=arr.length-1;i>position;i--){
            arr[i]=arr[i-1];
           
        }
        arr[position]=newelement;
     
             System.out.println("After adding in index");
               for(int i=0;i<arr.length;i++){
               System.out.println("elements at index " +i+":"+arr[i]);
       
     
       // System.out.println("Array ");
    }
    }
}
