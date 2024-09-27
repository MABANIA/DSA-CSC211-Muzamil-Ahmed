/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DSA_LAB05;

/**
 *
 * @author Muzamuil Ahmed
 */
public class Stack_Array {

    int[] arr;
    int top;

    public Stack_Array(int size){
    this.arr=new int[size];
    this.top=-1;
    }
    boolean empty(){
    return this.top==-1;
   }
    boolean isfull(){
    return this.top == this.arr.length-1;
    }
    public void push(int data) {
       if(isfull()){
           System.out.println("Stack is full");
       return ;
       }
        arr[++top] = data;
    }

    public int peek() {
        if(empty()){
            System.out.println("Stack is empty");
        return-1;
        }
        return arr[top];
        
    }

    public int pop() {
        if(empty()){
            System.out.println("Stack is empty can't pop it");
        return-1;
        }
        return arr[--top];
    }

    public void display() {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

  
    public static void main(String[] args) {
        Stack_Array s1 = new Stack_Array(6);
        System.out.println(s1.pop());
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);
        s1.push(70);
        s1.pop();
        s1.display();

        // TODO code application logic here
    }

}
