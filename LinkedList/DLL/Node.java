/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author k163641
 */
public class Node {
    Node next;
    Node prev;
    int data;
    
    Node()
    {
        data = 0;
        next = null;
    }
    Node(int data)
    {
        this.data = data;
        next = null;
        prev = null;
    }
    Node(int data, Node next,Node prev)
    {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
    void setNext(Node next)
    {
        this.next = next;
    }
    Node getNode()
    {
        return next;
        
    }
    void setPrev(Node prev)
    {
        this.prev = prev;
    }
    Node getPrev()
    {
        return prev;
    }
    int getData()
    {
        return data;
    }
    void setData(int data)
    {
        this.data = data;
    }
    
}
