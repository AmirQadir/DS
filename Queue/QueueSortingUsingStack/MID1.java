/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Amir Qadir
 */
public class MID1 {
    Queue q= new LinkedList();
    void add()
    {
       
        q.add(5);
        q.add(4);
        q.add(3);
    }
    void disp()
    {
       // System.out.println(q.peek());
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
    int moveElements(Stack<Integer> src,Stack<Integer> dest)
    {   int min=0;
        if(!src.isEmpty())
        {
            min = src.peek();
            src.pop();
        }
        while(!src.isEmpty())
        {
            if(min>src.peek())
            {
                dest.add(min);
                min = src.peek();
            }
            else
            {
                dest.push(src.peek());
                src.pop();
            }
            src.pop();
        }
        return min;
    }
    void  sortQueue()
    {
    Stack q1= new Stack<>();
    Stack q2= new Stack<>();
    if(q.isEmpty())
    {
        System.out.println("Nahe bhai");
    }
    while(!q.isEmpty())
    {
        q1.add(q.peek());
        q.remove();
    }
    boolean c = false;
    int min;
    while(!q1.isEmpty() || !q2.isEmpty())
    {
        if(c)
        {
         min = moveElements(q1,q2); 
            System.out.println("Adding " + min);
         q.add(min);
         c =false;
        }
        else
        {
         min = moveElements(q2,q1);
         System.out.println("Adding " + min);
         q.add(min);
         c = true;
         
        }
            
    }
    
    }
    public static void main(String[] args) {
   
   
    MID1 q2 = new MID1();
     q2.add();
    q2.sortQueue();
    q2.disp();
       // System.out.println(q.peek());
    
    
   }
        
       
    
}
