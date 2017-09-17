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
public class Queue {
     Node front;
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
    boolean isEmpty()
    {
        return front==null;
    }
    int peek()
    {
        return front.getData();
        
    }
    void dequeue()
    {
        front = front.getHead();
    }
    void enqueue(int data)
    {   Node temp = new Node(null,data);
        if(front==null)
        {
            front = temp;
        }
        else
        {
            front.setHead(temp);
            temp = front;
        }
    }
}
