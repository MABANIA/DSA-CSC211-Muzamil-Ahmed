/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB05;
import java.util.Stack;
/**
 *
 * @author Muzamuil Ahmed
 */
public class Task3 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    arr[i] = -1;
                    for (int k = j; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j]) {
                            arr[i] = nums2[k];
                            break;
                        }

                    }
                }
            }
        }


        return arr;
    }
    public static void main(String[] args) {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = new Task3().nextGreaterElement(nums1, nums2);
        for (int j : nums3) {
            System.out.print(j + " ");
        }
    }
}