/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa_lab2;

/**
 *
 * @author Muzamuil Ahmed
 */
public class Task_3 {
    public int mostWordsFound(String[] sentences) {
int k=0;
for(int i=0;i<sentences.length;i++){
String [] str=sentences[i].split(" ");
int n=str.length;
if(n>k)
k=n;
    }
return k;
}
    public static void main(String[]args){
    }
}


