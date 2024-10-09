/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LAB6;

/**
 *
 * @author Muzamuil Ahmed
 */
public class Task_1{

}
class Bubble_sort {

    public static int[] bubble(int[] arr) {
        int count=1;
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                System.out.print(count++ +" ");
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }
        return arr;

    }

    public static void main(String[] args) {
        System.out.println();
        int[] arr = {60, 30, 55, 78, 24,74};
        System.out.println();
        arr = bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

}
