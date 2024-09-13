/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Lab_04;

/**
 *
 * @author Muzamuil Ahmed
 */

//  Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb=new StringBuilder();
        ListNode temp=head;
        while(temp!=null){
            sb.append(temp.val);
            temp=temp.next;
        }
        int decimal = Integer.parseInt(sb.toString(), 2);
        return decimal;
    }
}
public class Task_2 {
    public static void main(String[] args) {
        
    }
  
}
