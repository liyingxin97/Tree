/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

public class binaryTree {
	
	protected btNode root;
	 
    /* Constructor */
    public binaryTree()
    {
        root = null;
    }
    /* Function to check if tree is empty */
    public boolean isEmpty()
    {
        return root == null;
    }
    /* Functions to insert data */
    public void insert(int data)
    {
        root = insert(root, data);
    }
    
    
    /* Function to insert data recursively */
    private btNode insert(btNode node, int data)
    {
        if (node == null)
            node = new btNode(data);
        else
        {
            if (data <= node.getData())
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }


  
   
    /* Function for preorder traversal */
    public void preorder()
    {
        preorder(root);
    }
    private void preorder(btNode r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }
    /*
    public void inorder()
    {
        //TO DO by students
    }
   
    
    public void postorder()
    {
    	//TO DO by students
    }
   
    
    
    /* Recursive approach to find height of binary tree *//////////////////////////////////////////////////
   /* public int findHeight(btNode root) {
     // TO DO by students
    }
    */
    
    

}
