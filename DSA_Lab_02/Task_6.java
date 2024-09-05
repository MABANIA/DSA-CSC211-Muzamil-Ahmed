/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab2;

/**
 *
 * @author Muzamuil Ahmed
 */
public class Task_6 {
    public int countPrimes(int n) {
     if(n<=2){
            return 0;
        }
        boolean[] isPrime = new boolean[n];
        for (int i = 3; i < n; i += 2) {
            isPrime[i] = true;
        }
        isPrime[2] = true; 
        for (int i=3; i*i<n; i+=2) {
            if (isPrime[i]) {
                for (int j = i*i; j<n; j+=2*i) {
                    isPrime[j] = false;
                }
            }
        }
       int count = 0;
        for (int i=2; i<n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
 return count;
    }
    public static void main(String []args){
    
    }
}

    

