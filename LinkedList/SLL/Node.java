/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package doublelinkedlist;

/**
 *
 * @author k163641
 */ // single linked list
public class Node {
    
    Node next;
    int data;
    
    Node()
    {
        data = 0;
        next = null;
    }
    
    Node(int data)
    {
        this.data = data;
    }
    Node(int data,Node next)
    {
        this.data = data;
        this.next = next;
    }
    void setNext(Node next)
    {
        this.next = next;
    }
    Node getNext()
    {
        return next;
    }
    void setData(int data)
    {
        this.data = data;
    }
    int getData()
    {
        return data;
    }
    
}
