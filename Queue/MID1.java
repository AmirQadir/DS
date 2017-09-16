/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Amir Qadir
 */
public class MID1 {
    Stack q1= new Stack<>();
    Stack q2= new Stack<>();
    
    void enqueue(int data)
    {
        while(!q2.isEmpty())
        {
         q1.add(q2.pop());
         
        }
        q2.add(data);
        while(!q1.isEmpty())
        {
            q2.add(q1.pop());
        }
        
       
       
    }
    
    
    
    void dequeue()
    {
        if(!q1.isEmpty())
        while(!q2.isEmpty())
        {   System.out.println("Element Added"+ q2.peek());
            q1.add(q2.pop());
            
        }
        
        if(q2.isEmpty())
        {
            System.out.println("working well");
        
        
        while(!q1.isEmpty())
        {
            q2.add(q1.pop());
        }
        }
        System.out.println("Element Removed " +q2.pop());
    }
    void front()
    {
          while(!q1.isEmpty())
        {
            q2.add(q1.pop());
        }
          System.out.println("Element "+ q2.peek());
    }
    public class Node{
        Node head;
        int data;

        public Node(Node head, int data) {
            this.head = head;
            this.data = data;
        }
        
        public Node getHead() {
            return head;
        }

        public void setHead(Node head) {
            this.head = head;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
        
        
        
    }
    public static void main(String[] args) {
        MID1 Obj = new MID1();
        Obj.enqueue(1);
        Obj.enqueue(2);
        Obj.enqueue(3);
        Obj.enqueue(4);
        Obj.dequeue();
        Obj.dequeue();
        Obj.enqueue(100);
        Obj.dequeue();
        Obj.dequeue();
        Obj.dequeue();
       // Obj.front();
    }
        
       
    
}
