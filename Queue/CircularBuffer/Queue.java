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
public class Queue {
    int []array;
    int front,rear;
    Queue()
    {
        array = new int[10];
        rear = -1;
        front = 0;
    }
    void enqueue(int val)
    {
        //rear++;
        rear = (rear+1)%10;
        System.out.println("I am  " + rear);
        array[rear]=val;
       
    }
    void dequeue()
    {
        front++;
    }
    void circulate()
    {
        int size = (rear-front)+1;
        int lower = 0;
        for(int i=0; i<size; i++)
        {
            array[lower+i]=array[front+i];
            front = lower;
            
        }
        rear = size+front-1;
    }
    void print()
    {
       for(int i=0; i<front; i++)
       {
           System.out.print("[] ");
       }
       
       for(int i=front; i<=rear; i++)
       {
           System.out.print(array[i] + " ");
       }
       for(int i=rear+1; i<10; i++)
       {
           System.out.print("[] ");
       }
        System.out.println("");
    }
    
   
    public static void main(String[] args)
    {
        Queue q1 = new Queue();
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(2);
        q1.dequeue();
        //q1.circulate();
        q1.enqueue(2);
        q1.enqueue(2);
        q1.enqueue(2);
        q1.enqueue(2);
        q1.enqueue(2);
        q1.enqueue(2);
        q1.enqueue(2);
        q1.circulate();
       // q1.enqueue(100);
        q1.print();
    }
}
