/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package braces;

/**
 *
 * @author Amir Qadir
 */
public class Braces<T extends Comparable<T>> {
    
    Node top; // for stack
    
    Braces()
    {
        top = null;
    }
    void push(T data)
    {
        Node temp = new Node(data,null);
        if(top==null)
        {
            top = temp;
        }
        else
        {
            temp.setHead(top); 
            top = temp;
        }
    }
    
    T pop()
    {
        T val = top.getData();
        top = top.getHead();
        return val;
    }
    boolean isEmpty()
    {
        return top==null;
    }
    T peek()
    {
        return top.getData();
    }
    
   

    public class Node{
        T data;
        Node head;
        public Node(T data,Node head)
        {
            this.data = data;
            this.head = head;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getHead() {
            return head;
        }

        public void setHead(Node head) {
            this.head = head;
        }
        
        
    }

    /**
     * @param args the command line arguments
     */
      static boolean  balance(String exp)
    {
        boolean ch = true;
        Braces k = new Braces();
        for(int i=0; i<exp.length(); i++)
        {   char c = exp.charAt(i);
           
            if(exp.charAt(i)=='(' || exp.charAt(i)=='{' || exp.charAt(i)=='[')
            {
                
              k.push(c);
               // System.out.println(c+"en");
               // k.pop();
               // System.out.println("Amir");
                
            }
            else if(c==']')
            {   //System.out.println("why");
                if(k.isEmpty() || k.pop().compareTo(']')!=0)
                {ch = false;
                    return false;
                }
            }
            
            else if(c==')')
            {   
                if(k.isEmpty() || k.pop().compareTo('(')!=0)
                {ch = false;
                    return false;
                }
            }
            
            else if(c=='}')
            {  // System.out.println("why3");
                if(k.isEmpty() || k.pop().compareTo('{')!=0)
                {   ch = false;
                    return false;
                }
            }
        }
        return ch;
    }
    public static void main(String[] args) {
        String exp = "(){}";
        Braces b = new Braces();
        if(balance(exp))
        {
            System.out.println("Equal");
               
        
        }
        else
        {
            System.out.println("Not Equal");
        }
    
}
}
