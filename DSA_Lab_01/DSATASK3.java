/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsatask3;

/**
 *
 * @author Muzamuil Ahmed
 */
public class DSATASK3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] arr={8,16,32,40,0};
        int deleteindex=2;
        for(int i=deleteindex;i<arr.length-1;i++){
        arr[i]=arr[i+1];}
        arr[arr.length-1]=0;
        System.out.println("array after deletion " );
for(int i=0;i<arr.length;i++){
    System.out.println("elements after deletion "+i+":"+arr[i]);
}
    }
    }
    

