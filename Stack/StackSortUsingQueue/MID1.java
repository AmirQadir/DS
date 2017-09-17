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
    Stack q= new Stack();
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
            q.pop();
        }
    }
    int moveElements(Queue<Integer> src,Queue<Integer> dest)
    {   int min=0;
        if(!src.isEmpty())
        {
            min = src.peek();
            src.remove();
        }
        while(!src.isEmpty())
        {
            if(min<src.peek())
            {
                dest.add(min);
                min = src.peek();
            }
            else
            {
                dest.add(src.peek());
                src.remove();
            }
            src.remove();
        }
        return min;
    }
    void  sortQueue()
    {
    Queue q1= new LinkedList<>();
    Queue q2= new LinkedList<>();
    if(q.isEmpty())
    {
        System.out.println("Nahe bhai");
    }
    while(!q.isEmpty())
    {
        q1.add(q.peek());
        q.pop();
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
