/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import progrados.*;

/**
 *
 * @author luisg
 */
public class BinarySearchTree <T>{
    public class Node<T> {
        T data;
        Node <T> left, right;
        
        public Node (T object){
            this.data = object;
            left=right=null;
        }
    }
    Node root;
    int currentSize;
    int nodeCount;
    int wordCount;
    public BinarySearchTree(){
        root = null;
        currentSize = 0;
        nodeCount= 0;
    }

    public interface Comparable<T>{
        public int compareTo(T object);    
    }

    public boolean addBST (T object){
        if (contains(object)){
            wordCount++;
            return false;
        }
        else if (root == null){
            root =  new Node<T> (object);
            nodeCount++;
        }
        else{
            add(object,root);
        }
        currentSize++;
        return true;
    }
    
    public void add (T object, Node<T> node){
        if (((Comparable<T>)object).compareTo(node.data)>=0){
            if (node.right == null){
                node.right = new Node<T> (object);
                nodeCount++;
                wordCount++;
                return;
            }
            add(object,node.right);
        }
        if (node.left == null){
            node.left = new Node <T>(object);
            nodeCount++;
            wordCount++;
            return;
        }
        add (object, node.left);
    }
    
    public boolean contains (T object){
        return contains (object,root);
    }
    
    public boolean contains (T object , Node<T> node){
        if (node == null){
            return false;
        }
        if (((Comparable<T>)object).compareTo(node.data)==0){
            return true;
        }
        if (((Comparable<T>)object).compareTo(node.data)>0){
            return contains(object,node.right);
        }
        return contains (object,node.left);
    }
    
    public boolean remove (T object){
        if (contains(object)){
            remove (root, object);
            nodeCount--;
            wordCount=0;
           return true; 
        }
        return false;
    }
    public Node remove (Node<T> node, T object){
        if (node==null){
            return null;
        }
        if (((Comparable <T>)object).compareTo(node.data)>0){
            node.left = remove (node.left , object);
        }
        else if (((Comparable <T>)object).compareTo(node.data)<0){
            node.right = remove (node.right, object);
        }
        else{
            if (node.left==null){
                Node nodeRightChild = node.left;
                
                node.data = null;
                node = null;
                
                return nodeRightChild;
            }
            else if (node.right==null){
                Node nodeleftChild = node.left;
                
                node.data = null;
                node = null;
                
                return nodeleftChild;
            }
            else {
                Node <T> tmp = findMin (node.right);
                node.data = tmp.data;
                node.right = remove (node.right,tmp.data);
            }
        }
        return node;
    }
    private Node findMin(Node <T> node){
        while (node.left!=null){
            node = node.left;
        }
        return node;
    }
}
