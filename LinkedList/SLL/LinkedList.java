/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package linkedlist;

/**
 *
 * @author Amir Qadir
 */
public class LinkedList{

    public static int size;
    private Node head; // *head
    private Node end;
    
    public LinkedList()
    {
        head=null;
        end = null;
        size = 0;
    }
    
    
   public void toPrint()
   {
       //String output ="";
       if(head!=null)
       {
           Node current = head.getNext();
           while(current!=null)
           {
               System.out.print(current.getData()+"\t");
               current = current.getNext();
           }
           System.out.println("");
       }
   }
   
   public void toFind(int data)
   {
       int i=0;
      // Node temp = new Node(data);
       Node current = head;
       if(current!=null)
       {
           while(current.getData()!=data)
           {
                i++;
               current = current.getNext();
              
           }
           if(!(i>0))
           {
            System.out.println("Element found at index "+i);
           }
           else
               System.out.println("Element found at index " +(i-1));
           
           
          
       }
       
   }
   public void DeleteAtStart()
   {
       Node p = head.getNext();
       head = null;
       head = p;
       
   }
   public void DeleteAtEnd()
   {
       Node p;
       Node current = head;
       while(current.getNext().getNext()!=null)
       {
           current = current.getNext();
           
       }
       current.setNext(null);   
   }
   public void DeleteAtValue(int data)
   {
       /* Logic 
            For example I have a list of element 1 2 4 7 and I want to del 2
            I will create a Node object assigning addresss of head
            and will move forward like .next.data  so that my current holds the address of previous element 
            I will hold that address in a temp
            and now Node k will hold the address of current.next the one which we want to remove
            and I will set temp.next = k.next;
       */
       Node p;
      Node current = head;
      while(current.getNext().getData()!=data)
      {
          current = current.getNext();
          
          
      }
      Node temp = current; 
      Node k = current.getNext();
      temp.setNext(k.getNext());
     
       
   }
   
   public void insert(int data)
    {
        
        if(head==null) //1st element 
        {
            head = new Node(data); 
            //current = head;// *head = new Node[];
        }
        
        Node temp = new Node(data);
         // current = a[0]
        Node current = head;
        if(current!=null) // means no element
        {
            while(current.getNext()!=null)
            {
                current = current.getNext(); // current = next
            }

            //current = current.getNext();
            current.setNext(temp);  // a[size] = element
            // current.insert(temp.getData()temp)
// ye isko null kardegi
        }
       // size++;
    
    }
    public void RemoveDuplicates()
    {
        Node current = head.next;
        while(current.next!=null)
        {
            if(current.data==current.next.data)
            {
                current.next = current.next.next;
                continue;
            }
            
                current = current.next;
            
            
        }
        //current = current.next;
//        Node index = head;
//        int val = head.data;
//        while(val!=index.getNext().getData())
//        {
//         index = index.getNext();
//         val = index.getData();
//            System.out.println("val is now " + val );
//        }
//        
//        Node temp = index;
//        System.out.println("Temp holds value" + temp.getData());
//        Node k = index.getNext().getNext();
//        System.out.println("K holds value" + k.getData());
//        temp.setNext(k.getNext());
        //head = temp;
        
        
        
                
         }
        
       
        
    
    public void insertAtStart(int data)
    {
        Node temp = new Node(data);
         if(head==null)
         {
             head = temp;
             //end = head;
         }
         else
         {
            // temp.setData(data);
            // temp.setNext(null);
             temp.setNext(head);
             //temp.next = head;
             
             head.setData(data);
             head = temp;
             //System.out.println("heads now points to" + temp.getData());
             //temp = head;
             //head.setData(data);
         }
     // inset(data,head);
    }
    
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(77);
        l1.RemoveDuplicates();
        //l1.DeleteAtValue(2);
        l1.toPrint();
      //  l1.insertAtStart(110); // sauban nalla
        //l1.toPrint();
     //   l1.DeleteAtStart();
       // l1.DeleteAtEnd();
      //  l1.insertAtStart(1);
       // l1.DeleteAtValue(5);
       //l1.insertAtStart(1);
       // l1.toPrint();
     //   l1.toFind(77);
        
       
        
    }
    
}
