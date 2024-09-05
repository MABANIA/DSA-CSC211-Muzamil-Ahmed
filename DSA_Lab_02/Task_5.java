/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab2;

/**
 *
 * @author Muzamuil Ahmed
 */
import java.util.*;
public class Task_5 {
    public int [] findIntersectionValues(int[] nums1, int[] nums2) {
      

    HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int[] ans= new int[2];
        int count1=0,count2=0;
        for(int c:nums1) set1.add(c);
        for(int c:nums2) {
            set2.add(c);
            if(set1.contains(c)) count2++;
        }
        for(int c:nums1){
            if(set2.contains(c)) count1++;
        }
        ans[0]=count1;
        ans[1]=count2;
        return ans;
        

    }
    public static void main(String []args){
    }
}


