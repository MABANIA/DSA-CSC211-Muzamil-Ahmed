/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DSA_Lab_04;
/**
 *
 * @author Muzamuil Ahmed
 *
 */
class doublelinkedlist{
   
class  Node{
int data;
Node previous;
Node next;
public Node(int data){
    this.data=data;
this.previous=null;
this.next=null;

}
} 
private Node head;
private Node tail;

public doublelinkedlist(){
this.head=null;
this.tail=null;
}    
public void insertatstart(int data){
    Node newNode= new Node(data);
    if(head==null){
    head=tail=newNode;
    }
    else {
    newNode.next=head;
    head.previous=newNode;
    head=newNode;
    
    
    }}
    public void displayend(int data){
        Node newNode= new Node(data);
    if(tail==null){
    head=tail=newNode;
    }
    else {
    tail.next=newNode;
newNode.previous=tail;
    tail=newNode;
    }}
    public void delete(int data){
    Node current =head;
    
    while(current !=null &&  current.data !=data){
    current =current.next;
}
    if (current ==null) {
        System.out.println("Node with value" + data + "not found");
        return;
        }
    if(current==head){
        head=current.next;
        if(head !=null){
 head.previous=null;          
}else {
            tail=null;
        }
    }
    else if (current == tail) {
            tail = current.previous;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null; 
            }
        }
      
        else {
            current.previous.next = current.next;
            if (current.next != null) {
                current.next.previous = current.previous;
            }
        }

        System.out.println("Node with value " + data + " deleted.");
    }

  
    public void displayForward() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("List forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

   
    public void displayBackward() {
        Node current = tail;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("List backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;
        }
        System.out.println();
    }
}

public class Task_1{
    public static void main(String[] args) {
        //Task_1 list = new Task_1();
        doublelinkedlist list=new doublelinkedlist();
       // list.insertatstart(6);
  list.insertatstart(10);
      list.insertatstart(20);
   list.displayend(30);
     list.displayend(40);
list.displayForward();   
            list.displayBackward();  
list.delete(30);
    list.displayForward();   
   list.displayBackward(); 
  list.delete(20);
  list.displayForward();  
    list.delete(40);
   list.displayForward();   
        }
}
        

    

    
