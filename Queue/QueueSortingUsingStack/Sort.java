/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author Amir Qadir
 */
public class Sort {
    int moveElements(Stack src,Stack dest)
    {
        int min = 0;
        if(!src.isEmpty())
        {
            min = src.peek();
            src.pop();
        }
        
        while(!src.isEmpty())
        {
            if(min>src.peek())
            {
                dest.push(min);
                min = src.peek();
            }
            else
            {
                dest.push(src.peek());
                
            }
            src.pop();
        }
        return min;
    }
    void SortingQueue(Queue q)
    {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        
        while(!q.isEmpty())
        {
            s1.push(q.peek());
            q.dequeue();
        }
        int min;
        boolean flag = true;
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            if(flag)
            {
                min = moveElements(s1,s2);
                q.enqueue(min);
                flag = false;
            }
            else
            {
                min = moveElements(s2,s1);
                q.enqueue(min);
                flag = true;
            }
        }
    }
    public static void main(String[] args) {
      Queue q1 = new Queue();
      q1.enqueue(10);
      q1.enqueue(2);
      Sort s1 = new Sort();
      s1.SortingQueue(q1);
        System.out.println(q1.peek());
        q1.dequeue();
        System.out.println(q1.peek());
    }
    
}
