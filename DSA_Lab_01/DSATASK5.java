/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsatask5;

/**
 *
 * @author Muzamuil Ahmed
 */
public class DSATASK5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int []arr={1,3,5,7,9};
        System.out.println("Arrays Elements ");
        for(int i=0;i<arr.length;i++){
            System.out.println("Elements at index :"+arr[i]);
            
        }
        for(int i=arr.length-1; i>=0; i--){
            System.out.println("reversed:" +arr[i]);
    }
    }
    
}
