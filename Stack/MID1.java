/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package mid1;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Amir Qadir
 */
public class MID1 {
    Queue q1= new LinkedList<Integer>();
    Queue q2= new LinkedList<Integer>();
    
    void push(int data)
    {
        if(q1.isEmpty())
        {
            q1.add(data);
        }
        else
        {
            while(!q1.isEmpty())
            {
                q2.add(q1.peek());
                
                q1.remove();
            }
            q1.add(data);
            while(!q2.isEmpty())
            {
                q1.add(q2.peek());
                q2.remove();
            }
            
        }
    }
    
    
    
    void pop()
    {
       q1.remove();
    }
    void top()
    {
         System.out.println("TOp element is " + q1.peek());
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
        Obj.push(1);
        Obj.push(2);
        Obj.top();
        Obj.pop();
        Obj.top();
    }
        
       
    
}
