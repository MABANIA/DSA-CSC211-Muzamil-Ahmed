/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab2;

import java.util.List;
import java.util.ArrayList;
public class Task2 {

    public List<Integer> findWordsContaining(String[] words, char x) {
        
   List<Integer> list = new ArrayList();
        String charToString = Character.toString(x);

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(charToString)) {
                list.add(i);
            }
        }
        return list;
    }
     public static void main(String[] args){



}
}
  
    


