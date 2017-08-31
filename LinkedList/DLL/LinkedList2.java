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
public class LinkedList {

    Node head;
   
    
    LinkedList()
    {
        head = null;
    }
    
    void insertAtTail(int data)
    {
        Node temp = new Node(data);
        
        if(head==null)
        {
            temp.setNext(null);
            temp.setPrev(null);
            head = new Node(data);
        }
        else
        {
            Node current = head;
            
            while(current.getNode()!=null)
            {
                current = current.getNode();
            }
           // temp.setNext(null);
            temp.prev = current.getNode();
            current.setNext(temp);
            
            /* Sir Abdul Aziz */
           /* temp.next = current.next;
            temp.next = current;
            temp.prev = current;*/
            
        }
    }
    
    void insertAtStart(int data)
    {
        Node temp = new Node(data);
        if(head == null)
        {
            temp.setPrev(null);
            head = temp;
            head.setNext(null);
        }
        else
        {
           Node current = head;
           temp.next = head;
           head  = temp;
            head.prev = null;
           //current.setPrev(head.getNode()); // aglay ka prev ka mery element k head say attach hojaye
          // head.setPrev(null);
          // Imp stuff ( below 2 lines are important )
       //   head.setNext(current);// temp ka next  aglay eelement k prev say connect hojaye
         // current.setPrev(head.getNode());
          
          //Sir Aziz
         /* temp.setNext(head);
          head.setPrev(temp);
          temp = head;*/
        }
    }
    void DeleteAtBeg()
    {
        head  = head.next;
        head.next.prev  = null;
    }
    void toPrint()
    {
        Node current = head;
        while(current.getNode()!=null)
        {
           
            System.out.print(current.getData()+"\t");
             current = current.getNode();
        }
        System.out.println(current.getData());
    }

    public static void main(String[] args) {
       LinkedList l1 = new LinkedList();
       l1.insertAtTail(0);
       l1.insertAtTail(1);
       l1.insertAtTail(33);
       l1.insertAtStart(11);
      // l1.DeleteAtBeg();
       l1.toPrint();
    }
    
}
