/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Lab03;
public class Slinkedlist {
    public class Node{
int data;
Node next;
Node(int data){
    this.data=data;
    this.next=null;
}}
private Node head;
private int size;
Slinkedlist(){
this.head=null;
}

//Adding First
public void insertAtStart(int data){
    Node newNode=new Node(data);
    newNode.next=head;
    head=newNode;
       size++;
}

//Delete from start
public void deleteheadnode(){
        if(this.head==null){
        System.out.println("List Is Empty cant delete node:");
        }
 head =head.next;
 size--;
 }


//Add Last
    public void insertAtAddlast(int data){
   Node newnode=new Node(data);
   Node current=head;
   while(current.next!=null){
   current=current.next;
   }
   size++;
   current.next=newnode;
    }
    
   //Delete from last
    public void deletefromEnd(){
Node secondLast=head;
Node last=head.next;
while(last.next!=null){
    last=last.next;
    secondLast=secondLast.next;
}
size--;
    secondLast.next=null;
    }
    
  //Size
    public int Size(int size){
    return size;
    }
    
    //Add Middle Position
   public void Addmiddle(int data,int position){
      Node newnode=new Node(data);
      if(position==0){
          newnode.next=head;
          head=newnode;
         }
      else{
            Node current=head;
            for(int count=1; count<position; count++){
        
                current=current.next;
            }
             newnode.next=current.next;
              current.next=newnode;
      }}
   
      //Searching Element
      public int searching(int key){
         Node temp=head;
         int position=1;
         while(temp!=null){
             if(temp.data==key){
             return position;
             }
             temp=temp.next;
             position++;
         }
         return -1;
      }
   
//Print Method
      public void print(){
        if(head == null){
            System.out.println("List is empty can;t print");
            return;
        }
        Node currentNode = this.head;
         while(currentNode != null){
         System.out.print(currentNode.data+" -->");  
         currentNode = currentNode.next;
          }
        System.out.println("Null");
    }
      public static void main(String[] args) {
    Slinkedlist list = new Slinkedlist();
    list.insertAtStart(1);
    list.insertAtStart(2);
    list.insertAtStart(3);
     list.insertAtAddlast(10);
    list.Addmiddle(20,2);
    System.out.println("Size: "+list.size);
    list.print();
    
    int position=list.searching(11);
    if(position==-1){
        System.out.println("Element not found in linked list: ");
      }
    else{
        System.out.println("Element Found: at :"+position+" in list");
    }
    list.print();
// list.deleteheadnode();
// System.out.println("Size: "+list.size);
// list.print();
    
    }}