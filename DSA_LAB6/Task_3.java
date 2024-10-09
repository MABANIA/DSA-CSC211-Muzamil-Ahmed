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
public class Task_3{

}
class SortStringsByLength {
public static void bubbleSortByLength(String[] arr) {
int n = arr.length;
boolean swapped;
for (int i = 0; i < n - 1; i++) {
swapped = false;
for (int j = 0; j < n - i - 1; j++) {
if (arr[j].length() > arr[j + 1].length()) {
String temp = arr[j];
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
public static void printArray(String[] arr) {
for (String str : arr) {
System.out.print(str + " ");
}
System.out.println();
    }
 public static void main(String[] args) {
 String[] arr = {"apple", "pie", "banana", "cat"};
        System.out.println("Original array:");
        printArray(arr);
       bubbleSortByLength(arr);
       System.out.println("Sorted array by length:");
        printArray(arr);
    }
}

