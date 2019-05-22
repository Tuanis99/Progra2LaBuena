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
public class LinkedListNode {
    public Particion element;
    public LinkedListNode next;
    
    public LinkedListNode(){
        
    }
    public LinkedListNode(Particion element){
        this.element = element;
        this.next = null;
        
    }
    public LinkedListNode(Particion element,LinkedListNode next){
        this.element= element;
        this.next=next;
    }

    public Particion getElement() {
        return element;
    }

    public void setElement(Particion element) {
        this.element = element;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
    
}
