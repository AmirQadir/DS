/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ll;

/**
 *
 * @author Amir Qadir
 */
public class LL {
    Node head;
    Node tail;
    
    LL()
    {
        head = null;
    }
    private class Node{
        Node next;
        Node prev;
        int data;
        Node(int data)
        {
            this.data = data;
            next = null;
            prev = null;
        }
        Node(int data,Node next,Node prev)
        {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
        int getData(){return data;}
        Node getNext(){return next;}
        Node getPrev(){return prev;}
        void setPrev(Node prev){this.prev = prev;}
        void setNext(Node next){this.next = next;}
    }
    void insertAtPos(int data,int pos)
    {
        int i=0;
       Node temp = new Node(data);
        Node current = head;
        while(i!=pos)
        {
            i++;
            current = current.getNext();
        } 
        temp.setNext(current.getNext());
        temp.setPrev(current);
        current.getNext().setPrev(temp);
        current.setNext(temp);
       
       
        
    }
    void insertAtFirst(int data)
    {
        Node temp = new Node(data,null,null);
        if(head==null)
        {
            head = temp;
            tail = head;
        }
        else
        {
            head.setPrev(temp);
            //temp.setPrev(null);
            temp.setNext(head);
            head = temp; 
            
        }
    }
    void insert(int data)
    {
        Node temp = new Node(data,null,null);
        if(head==null)
        {
            head = temp;
            tail = head;
        }
        else
        {
            temp.setPrev(tail);
            System.out.println("temp prev is now" + temp.getPrev().getData());
            tail.setNext(temp);
            tail = temp;
            
            
            
        }
                 
      // insert(head,data);
    }
    Node insert(Node head,int data)
    {
        if(head==null)
        {
            head = new Node(data);
            return head;
        }
        else
        {
            insert(head.getNext(),data);
        }
        return head;
            
    }
    void toPrint()
    {
       /* while(head!=null)
        {
            System.out.println(head.getData());
            if(head.getNext()!=null)
            {
                
            
            head = head.getNext();
            }
            else
            {
                break;
            }
        }*/
       toPrint(head);
      /*  if(head.getNext()==null)
        {
            System.out.println(head.getData());
        }
        Node temp = head;
        while(temp.getNext()!=null)
        {
            System.out.print(temp.getData()+"--");
            temp = temp.getNext();
            
        }
        System.out.println(temp.getData());*/
    }
    Node toPrint(Node head)
    {
        if(head==null)
        {
            return head;
        }
        else
        {
            System.out.println(head.getData());
            head =toPrint(head.getNext());
        }
        return head;
    }
    void DeleteAtFirst()
    {   
        if(head!=null)
            System.out.println("Deleting Element " + head.getData());
            head = head.next;
        
        head.prev = null;
        
    }
    void DeleteAtLast()
    {
        if(tail!=null)
        {
            System.out.println("Deleting Element " + tail.getData());
            tail = tail.getPrev();
            tail.next = null;
        }
    }
    void PrintBackward()
    {
        if(head==null)
        {
            System.out.println("LIST IS EMPTY");
        }
        else
        {
            while(head.getNext()!=null)
            {
                head = head.getNext();
            }
            
            if(head.getNext()==null)
            {
                System.out.println("hi");
                head= head.getPrev();
                while(head.getPrev()!=null)
                {
                    System.out.println("data is " + head.getData());
                    head = head.getPrev();
                }
            }
        }
    }
    
      
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LL l1 = new LL();
        l1.insert(1);
        l1.insert(2);
       // l1.insert();
        l1.insert(4);
        l1.insert(5);
        l1.toPrint();
        //l1.insertAtFirst(0);
        l1.insertAtPos(3, 1);
        System.out.println("now ");
      l1.toPrint();
      //l1.DeleteAtFirst();
      l1.DeleteAtLast();
      l1.toPrint();
    }
    
}
