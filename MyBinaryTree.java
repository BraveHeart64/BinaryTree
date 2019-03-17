/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryan
 */
public class MyBinaryTree {
    Node head = null;
    
    public void Add(int value){
        Node tempvalue = new Node(null,null, value);
        if(head == null){
         head = tempvalue;
        } 
        else{
           PlaceValue(head,tempvalue);
        }
            
}
    
    
    public void PlaceValue(Node root, Node temp){
        
     if(root.value < temp.value && root.right == null){
         root.right = temp;

     }
     else if(root.right != null && root.value < temp.value){
         PlaceValue( root.right, temp);
     }
     else
    
     {
     
         
         
       if(root.value > temp.value  && root.left == null){
         root.left = temp;

        }
       else if(root.value < temp.value && root.right == null){
           root.right = temp;
           
       }
       else {
             PlaceValue( root.left, temp);
            
         }
     
    
       }
    }
}