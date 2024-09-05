/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa_lab2;

/**
 *
 * @author Muzamuil Ahmed
 */
public class DSA_lab2 {

    public int[] getConcatenation(int[] nums) {
     int n=nums.length;
     int[]ans =new int[n*2];
     for(int i=0;i<n;i++){

        ans[i]=nums[i];
        ans [i+n]=nums[i];
     }
     return ans;
    }






    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
    }
}