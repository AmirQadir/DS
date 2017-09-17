/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author Amir Qadir
 */
public class Stack {
    Node top;
    public class Node{
        Node head;
        int data;

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

        public Node(Node head, int data) {
            this.head = head;
            this.data = data;
        }
        
    }
    void push(int data)
    {
        Node temp = new Node(null,data);
        if(top==null)
        {
            top = temp;
        }
        else
        {
            temp.setHead(top);
            top = temp;
        }
    }
    boolean isEmpty()
    {
        return top==null;
    }
    int peek()
    {
        if(top!=null)
        {
            return top.getData();
        }
        else
        {
            return -1;
        }
    }
    int pop()
    {
        int data = top.getData();
        top = top.getHead();
        return data;
    }
   
}
