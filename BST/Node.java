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
public class Node {
    Node left;
    Node right;
    int data;
    
    Node()
    {
        data = 0;
        left = null;
        right = null;
    }
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
        
    }
    Node(int data,Node right,Node left)
    {
        this.data = data;
        this.right = right;
        this.left = left;
    }
    
    void setRight(Node right)
    {
        this.right = right;
    }
    void setLeft(Node left)
    {
        this.left = left;
    }
    Node getRight()
    {
        return right;
        
    }
    Node getLeft()
    {
        return left;
    }
    int getData()
    {
        return data;
    }
    void setData(int data)
    {
        this.data = data;
    }
   
            
    
    
}
