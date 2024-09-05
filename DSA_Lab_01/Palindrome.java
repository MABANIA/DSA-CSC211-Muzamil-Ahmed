/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsatask6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
          Scanner i=new Scanner(System.in);
         System.out.println("Write down the String");
        String name=i.nextLine();

        
        String reverse= new StringBuilder(name).reverse().toString();
        if(name.equalsIgnoreCase(reverse)){
            System.out.println("String is palindrome:");
        }else{
            System.out.println("String is not Palindrome:");
        }
    }
 
}
