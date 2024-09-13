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
    public ListNode middleNode(ListNode head) {
        if(head.next == null)
            return head;
        ListNode temp = head;
        int t = 0;
        while(temp.next != null){
            temp = temp.next;
            t++;
        }
        t = (t + 1) / 2;
        while(t > 0){
            head = head.next;
            t--;
        }
        return head;
    }
}
public class Task_01 {
    public static void main(String[] args) {
        
    }
   
}
