/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DSA_LAB05;

/**
 *
 * @author Muzamuil Ahmed
 */
public class Stack_Linkedlist {
    public class Node{
    
    int data;
    Node next;
    public Node (int data){
            this.data=data;
            this.next=null;
                    }
    }
    private Node top;
    public Stack_Linkedlist(){
this.top=null;

}
public void push(int data){
Node newNode =new Node(data);
if (top == null){
top=newNode;
return;
}
newNode.next=top;
top=newNode;
}
    public int peek(){
    return top.data;
    
    }
    public int  pop(){
    int temp =top.data;
    top=top.next;
    return temp;
    }
        public Node isEmpty(){
       return top=null;
}
        
        public void Display(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else {
        Node current =top;
        while(current!=null){
            System.out.println(current.data);
        current = current.next;
        }
        
        }
        }
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Stack_Linkedlist Stackl =new Stack_Linkedlist();
  Stackl.push(10);
  Stackl.push(20);
    Stackl.push(30);
        System.out.println(Stackl.peek());
        System.out.println(Stackl.peek());
        System.out.println(Stackl.pop());  
        System.out.println(Stackl.peek());
        System.out.println(Stackl.isEmpty());
        System.out.println("FINAL STACK");
    }
    
}
