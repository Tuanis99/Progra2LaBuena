/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;
import java.util.Stack; 
import progrados.*;

/**
 *
 * @author luisg
 * @param <T>
 */
public class AVLTree <T> implements Comparable<T>{
    public class NodeAVL <T> {
        T data;
        NodeAVL <T> left;
        NodeAVL <T> right;
        NodeAVL <T> parent;
        NodeAVL <T> current;
        NodeAVL <T> leafNode;

        public NodeAVL<T> getCurrent() {
            return current;
        }

        public void setCurrent(NodeAVL<T> current) {
            this.current = current;
        }
        
        
    
        public NodeAVL (T object){
            data = object;
            parent = right = left = current = null;
        }
        
        public void leafConstructor(T object){
            data = object;
            //parent = ;
            right = left = null;
        }
    }
    
    NodeAVL root;
    int currentSize;
    public AVLTree (){
        root = null;
        currentSize =0;
    }
    
    public void addAVL(T object){
        NodeAVL <T> node =  new NodeAVL <T> (object);
        if (root == null){
            root = node;
            currentSize++;
            return;
        }
        add(root,node);
    }
    
    public void addLeafNode(T object){
        NodeAVL <T> node =  new NodeAVL <T> (object);
        if (root == null){
            root = node;
            currentSize++;
            return;
        }
        add(root,node);
    }
        
    private void add (NodeAVL <T> parent, NodeAVL <T> newNode){
        if (((Comparable <T>)newNode.data).compareTo(parent.data)>0){
            if (parent.right == null){
                parent.right = newNode;
                newNode.parent = parent;
                currentSize++;
            }
            else {
                add(parent.right,newNode);
            }
        }
        else{
            if (parent.left == null){
                parent.left = newNode;
                newNode.parent = parent;
                currentSize++;
            }
            else {
                add(parent.left,newNode);
            }
        }
    }
    
        public int compareTo(T object){ 
            if (1 > 0) {
                return -1;
            } else if (0 < 1) {
                return 1;
            } else {
                return 0;
            }
        }
    
    public void checkBalance (NodeAVL <T> node){
        if ((height(node.left) - height (node.right)>1)||(height(node.left) - height (node.right)<-1)){
            rebalance(node);
        }
        if (node.parent == null){
            return;
        }
        checkBalance(node.parent);
    }
    public void rebalance (NodeAVL<T> node){
        if (height(node.left) - height (node.right)>1){
            if (height(node.left.left)>height(node.left.right)){
                node = rightRotate(node);
            }
            else{
                node = leftRightRotate(node);
            }
        }
        else{
            if (height(node.left.left)>height(node.left.right)){
                node = rightRotate(node);
            }
            else{
                node = leftRightRotate(node);
            }  
        }
        if (node.parent == null){
            root = node;
        }
    }
    public int height(){
        if (root == null)
            return 0;
        return height(root)-1;
    }
    private int height (NodeAVL <T> node){
        if(node == null){
            return 0;
        }
        int leftHeight = height (node.left)+1;
        int rightHeight = height (node.right)+1;
        
        if (leftHeight > rightHeight){
            return leftHeight;
        }
        return rightHeight;
    }
    
    public NodeAVL<T> leftRotate(NodeAVL <T> node){
        NodeAVL <T> tmp = node.right;
        node.right=tmp.left;
        tmp.left = node;
        return tmp;
    }
    public NodeAVL<T> rightRotate(NodeAVL <T> node){
        NodeAVL <T> tmp = node.left;
        node.left=tmp.right;
        tmp.right = node;
        return tmp;
    }
    public NodeAVL<T> rightLeftRotate (NodeAVL <T> node){
        node.right = rightRotate(node.right);
        return leftRotate(node);
    }
    
    public NodeAVL<T> leftRightRotate (NodeAVL <T> node){
        node.left = leftRotate (node.left);
        return rightRotate (node);
    }
    
    public boolean contains (T object){
        return contains (object,root);
    }
    
    public boolean contains (T object , NodeAVL<T> node){
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
    
    public void delete(NodeAVL <T> node) {
        if (node.left == null && node.right == null) {
            if (node.parent == null) {
                root = null;
            }
            else {
                NodeAVL parent = node.parent;
                if (parent.left == node) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
                rebalance(parent);
            }
            return;
        }
        if (node.left != null) {
            NodeAVL <T> child = node.left;
            while (child.right != null) child = child.right;
            node.data = child.data;
            delete(child);
        }
        else {
            NodeAVL <T> child = node.right;
            while (child.left != null) child = child.left;
            node.data = child.data;
            delete(child);
        }
    }
    
    public void deleteAllNode(NodeAVL<T> node){
        
    }
    public void deleteALL(NodeAVL node){
        if (root!=null){
            deleteALL(root.left);
            deleteALL(root.right);
        }
        root=null;
    }
    public NodeAVL find (T object){
        return find (object,root); 
    }
    
    public NodeAVL<T> find(T object,NodeAVL<T> node){
        if (node==null){
            System.out.println("El arbol se encuentra vacio");
        }
        if(((Comparable <T>)object).compareTo(node.data)==0){
            return node;
        }
        if (((Comparable <T>)object).compareTo(node.data)>0){
            return find (object,node.right);
        }
        return find(object,node.left);
    }
    
    public void printTree(NodeAVL<T> node){
        if (node == null){
            return;
        }
        Stack <NodeAVL> nodeStack = new Stack<NodeAVL>();
        nodeStack.push(root);
        while (nodeStack != null){
            NodeAVL newNode = nodeStack.peek();
            System.out.println(newNode.data + " ");
            nodeStack.pop();
            
            if (newNode.right != null){
                nodeStack.push(newNode.right);
            }
            if (newNode.left != null){
                nodeStack.push(newNode.left);
            }
        }
    }
    public void getDirectory (NodeAVL <T> node){
        if (node == null){
            return;
        }
        Stack <NodeAVL> nodeStack = new Stack<NodeAVL>();
        nodeStack.push(root);
        
        while (nodeStack!=null){
            NodeAVL newNode = nodeStack.peek();
            System.out.println(newNode.data + " ");
            nodeStack.pop();
            
            if (newNode.right !=null){
                nodeStack.push (newNode.right);
            }
            if (newNode.left !=null){
                nodeStack.push (newNode.left);
            }
        }
    }
}
