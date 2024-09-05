/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab2;

/**
 *
 * @author Muzamuil Ahmed
 */
public class Task_4 {
     public int countKDifference(int[] nums, int k) {

   int count =0;
        for(int i =0; i<nums.length;i++){
            for(int j= i+1; j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    count++;
                   
                }
            }
                 
            }
        
        return count;
        
    }

public static void main(String[]args){


}

    

    
}
