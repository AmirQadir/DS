/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package reversell;

/**
 *
 * @author Amir Qadir
 */
public class ReverseLL {
    
    
    public class Node{
        
        private Node next;
        private  int size,data;
        Node()
        {
            next =  null;
            data = 0;
            
        }
        Node(int data)
        {
            this.data = data;
            next = null;
            size++;
        }
        Node(Node next,int data)
        {
            this.next = next;
            this.data = data;
            size++;
        }
        void setNext(Node next)
        {
            this.next = next;
        }
        void setData(int data)
        {
            this.data = data;
        }
        int getData()
        {
            return data;
        }
        Node getNode()
        {
            return next;
        }
        void INC()
        {
            size++;
        }
        int getINC()
        {
            return size;
        }
        
        
    }
    Node head;
    int size;
    Node []arr;
    void findreverse()
    {
        checksize();
    }
    void checksize()
    {
        size++;
        Node curr=head;
        while(curr.getNode()!=null)
        {
            size++;
            curr=curr.getNode();
        }
      //  System.out.println("Size is "+ size);
        arr = new Node[size];
        reverse();
    }
    void reverse()
    {
        /* Logic 
        first I made another node which took the reference of head 
        and iterate it to the end while incrementing a variable so that i get to know how many
        nodes (elements are present in my LL)
        after this I assign the address to my Node array with number of elements(nodes) present there
        then now my node contains all the address
        I made another Node cusrr and pointed it to head
        and a temp variable which contains the first element (to be swapped with last)
        now the reference of each will contain the last data
       
        for(int j=2; i>=0 j--
        
        head.setdata(arr[j].getdata)   head earlier have the data of 1 now have a data of 3
        head = head.getNode()  head is updated means goes on second iteration and so on
        
        finally the last element is swapped with first 
        
        */
//        int i=0;
//        Node curr = head;
//        arr[i]=curr;
//        while(curr.getNode()!=null)
//        {
//            i++;
//            arr[i]=curr.getNode();
//            curr = curr.getNode();
//            
//        }
//      //head= null;
//     // head.setNext(null);
//     Node cusrr = head;
//     int temp = cusrr.getData();
//        for(int j=size-1; j>=0; j--)
//        {
//           
//            cusrr.setData(arr[j].getData());
//            if(j!=0)
//            cusrr = cusrr.getNode();
//             // System.out.println("hi"+arr[j].getData());
//              if(j==0)
//              {
//                  cusrr.setData(temp);
//              }
//            //System.out.println(arr[j].getData());
//        }
//        
        Node curr = head;
        Node nex = null;
        Node pre = null;
        while(curr!=null)
        {
            nex = curr.next;
            curr.next = pre;
           pre = curr;
           curr = nex;}
        head = pre;
                
        
    }
    ReverseLL()
    {
        head = null;
    }
    void insert(int data)
    {
        //insert(head,data);
        Node temp = new Node(data);
        if(head==null)
        {
            head = temp;
            temp.INC();
        }
        else
        {
            Node current = head;
            while(current.getNode()!=null)
            {
                current = current.getNode();
            }
            current.setNext(temp);
        }
    }
    Node insert(Node curr,int data)
    {
        if(curr==null)
        {
            curr.setNext(new Node(data));
            curr.INC();
            return curr;
        }
        else
        {
            curr = insert(curr.getNode(),data);
        }
        return curr;
    }
    Node print(Node head)
    {
        if(head==null)
        {
            //System.out.println("I am null");
            return head;
        }
       System.out.println(head.getData());
        //System.out.println("Size is "+head.getINC());
       head = print(head.next);
        return head;
    }
    
    void toPrint()
    {
        print(head);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ReverseLL l1= new ReverseLL();
       l1.insert(1);
       l1.insert(2);
       l1.insert(3);
       l1.insert(4);
       l1.insert(10);
        System.out.println("Before reverse");
       l1.toPrint();
        System.out.println("After Reverse");
       l1.reverse();
       l1.toPrint();
       
       /* This has been done by reference */
       
    }
    
}
