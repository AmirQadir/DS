/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cll;

/**
 *
 * @author Amir Qadir
 */
public class CLL {

    public class Node{
        private Node next;
        private Node prev;
        String data;
        Node()
        {
            data = null;
            next = null;
            prev =  null;
        }
        Node(String data)
        {
            this.data = data;
            next = null;
            prev = null;
            
        }
        Node(String data,Node next,Node prev)
        {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
        void setData(String dat)
        {
            this.data = dat;
        }
        void setPrev(Node prev)
        {
            this.prev = prev;
        }
        void setNext(Node next)
        {
            this.next = next;
        }
        Node getPrev(){return prev;}
        Node getNext(){return next;}
        String getData(){return data;}
        
                
    }
    
    Node head;
    Node tail;
    CLL()
    {
        head=null;
        tail  =  null;
    }
    
    void Insert(String data)
    {
        Node temp = new Node(data);
        if(head==null)
        {
            temp.next = temp;
            temp.prev = temp;
            head=temp;
            tail = head;
        }
        else
        {
           // System.out.println("tail " + tail.getData());
            temp.setPrev(tail); // ok scenee
            tail.setNext(temp); // ok
            head.prev = temp;
            temp.setNext(head); // for CLL
            tail = temp;
            
        }
    }
    
//    
//    public void insert(int val)
//    {
//        System.out.println("Hi amir");
//        Node nptr = new Node(val, null, null);        
//        if (head == null)
//        {
//            nptr.setNext(nptr);
//            nptr.setPrev(nptr);
//            head = nptr;
//            tail = head;
//        }
//        else
//        {
//            nptr.setPrev(tail);
//            tail.setNext(nptr);
//            head.setPrev(nptr);
//            nptr.setNext(head);
//            tail = nptr;    
//        }
//       // size++;
//    }
    Node print(Node head)
    {
        if(head==null)
        {
            return null;
        }
        else
        {
            System.out.println(head.getData());
            head = print(head.next);
        }
        return head;
    }
    void toPrint()
    {
        //print(head);
        Node curr = head;
      //  System.out.println("Hiamir");
        if(head.next == head)
        {
            System.out.println(head.getData()+"<->"+curr.getData());
        }
        System.out.println(head.getData());
        curr = head.getNext();
        
        while(curr.getNext()!=head)
        {
            System.out.println(curr.getData());
            curr = curr.next;
        }
        System.out.println(curr.getData());
        curr = curr.next;
        System.out.println(curr.getData());
    }
    
            public void display()
    {
        System.out.print("\nCircular Doubly Linked List = ");
        Node ptr = head;
        
        if (head.getNext() == head) 
        {
            System.out.print(head.getData()+"->");
            return;
        }
        System.out.print(head.getData()+ "->");
        ptr = head.getNext();
        while (ptr.getNext() != head) 
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData()+ "->");
        ptr = ptr.getNext();
        System.out.print(ptr.getData()+ "\n");
        System.out.println("");
    }
    public static void main(String[] args) {
        CLL l1 = new CLL();
        l1.Insert("net 1");
        l1.Insert("net 2");
        l1.Insert("net 3");
        l1.Insert("net 4");
        l1.Insert("net 5");
        l1.display();
    }
    
}
