public class LL{
	
	
	public class Node{
		
		public  Node next;
    int data;
    public Node(int data,Node next)
    {
        this.data = data;
        this.next = next;
    }
    public Node(int data)
    {
        this.data = data;
        next = null;
    }
    public Node()
    {
        next = null;
        data = 0;
    }
    public Node getNext()
    {
        return next;
    }
    public void setData(int data)
    {
        this.data = data;
    }
    public void setNext(Node next)
    {
        this.next = next;
    }    
    public int getData()
    {
        return data;
    }
   
	}
	
	
	private Node head; // *head
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
        //size++;
    
    }
	 public void toPrint()
   {
       
       //String output ="";
       if(head!=null)
       {
           Node current = head.getNext();
           while(current!=null)
           {
               System.out.println(current.getData()+"\n");
               current = current.getNext();
           }
       }
   }
	void swap(int data)
    {
        Node curr = head;
        while(curr.next.data != data)
        {
            curr = curr.next;
        }
		//System.out.println("swapping " + curr.data + "with " + current.next.data);
        Node prev = curr;
        Node element = curr.next;
        Node toswap = curr.next.next;
        prev.next = element.next;
        element.next = toswap.next;
        //System.out.println("element next " + element.data + " toswap next " + toswap.next.data);
        toswap.next = element;
        //System.out.println("Element " + toswap.next.data + "ele" + element.data);
        
        
    }
    public static void main(String [] args)
	{
		
		LL l1 = new LL();
		l1.insert(10);
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(50);
		
		l1.swap(30);
		l1.toPrint();
	}

}
	
	