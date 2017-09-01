/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package bst;

/**
 *
 * @author Amir Qadir
 */
public class BST {
    
    Node root;
    
    /*void insert(int data)
    {
        insert(root,data);
    }*/
    BST()
    {
        root = null;
    }
    void insert(int data)
    {
        //Node current = root;
        root = insert(root,data);
    }
    Node insert(Node root,int data)
    {   //System.out.println("hi");
       // Node temp = root;
        //temp.setLeft(null);
        //temp.setRight(null);
        //Node current;
        //Node parent;
        if(root==null)
        {
           // System.out.println("hi");
            //System.out.println("hi");
           // temp = new Node(data);
            root = new Node(data);
            //return root;
            //root.setRight(root);
            
        }
        else
        {
          if(root.getRight()!=null)
          {
             root.setRight((insert(root.getRight(),data)));
          }
          else
          {
              root.setLeft((insert(root.getLeft(),data)));
          }
        }
        return root;
    }
    public void preOrder(Node r)
    {
       // System.out.println("aar");
        if(r!=null)
        {
            /* In Order  
            left 
            data
            right
            */
            /* Pre Order
                Data 
                left
                right
            */
             preOrder(r.getLeft()); 
            System.out.println(r.getData()+" "); // first root then left then go right
           
            preOrder(r.getRight());
        }
    }
     void toPrint()
    {
     
        preOrder(root);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BST bst = new BST();
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        bst.toPrint();
    }
    
}
