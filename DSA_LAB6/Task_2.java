/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB6;

/**
 *
 * @author Muzamuil Ahmed
 */
public class Task_2{


}
class OptimizedBubbleSort {
public static void earlyStopBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
        swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
        swapped = true;  
                }
            }
            if (!swapped) {
                break;
    }
  }
}
 public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
 public static void main(String[] args) {
   int[] arr = {5, 1, 4, 2, 8};
        System.out.println("Original array:");
        printArray(arr);
        earlyStopBubbleSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}