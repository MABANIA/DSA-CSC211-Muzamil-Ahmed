/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB6;

import java.util.Arrays;

/**
 *
 * @author Muzamuil Ahmed
 */
public class LC1 {
    public static void main(String[] args) {
        class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
    }
}
