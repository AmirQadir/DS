/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

/**
 *
 * @author k163641
 */ // single linked list
public class LinkedList {
    Node head;
    LinkedList()
    {
        head = null;
    }
    
    
    void insert(int data)
    {
        Node temp = new Node(data);
        if(head==null)
        {
            head = temp;
        }
        else
        {
            
        
        Node current = head;
        while(current.getNext()!=null)
        {
            current = current.getNext();
        }
        current.setNext(temp);
        }
    }
    void InsertAtBeg(int data)
    {
        Node temp = new Node(data);
        if(head==null)
        {
            head = temp;
        }
        /*Node current = head; // holds the previous address of head
        head = temp; // Mine Method
        head.next = current; // head.next -- >> previous head 
        */ // Below is Sir Abdul Aziz Method
        temp.next = head;
        head = temp;
    }
    void DeleteAtBeg()
    {
        //Node current = head;
        
        head = head.next;
    }
    void DeleteElement(int data)
    {
        Node current = head;
        while(current.getNext().getData()!=data)
        {
            current = current.getNext();
        }
      //  System.out.println("I am at the element of  " + current.getData());
        Node add = current.getNext();
        
        //System.out.println("And I have the reference of " + add.getData());
        //current.getNext() = add.getNext();
        current.setNext(add.getNext());
    }
    void toPrint()
    {
        Node current = head;
        while(current.getNext()!=null)
        {
            System.out.print(current.getData()+"\t");
            current= current.getNext();
        }
        System.out.println(current.getData());
    }
    void insertAtMid(int data,int second)
    {
        Node temp = new Node(second);
        
        Node current = head;
        while(current.getData()!=data)
        {
            current = current.getNext();
        }
        Node p = current; 
        System.out.println("I have the data of " + p.getData());
        current.setNext(temp);
        //temp.setNext(current);
    }
    boolean isEmpty()
    {
        return head==null;
    }
    
    public static void main(String[] args)
    {
        LinkedList l1 = new LinkedList();
        l1.insert(1);
        l1.insert(33);
        l1.InsertAtBeg(2);
        l1.insertAtMid(1,222);
        l1.insert(44);
        l1.DeleteElement(222);
        l1.InsertAtBeg(3333);
      //  l1.DeleteAtBeg();
        l1.toPrint();
    }
    
}
