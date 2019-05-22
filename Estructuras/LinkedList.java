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
public class LinkedList{//Declaracion de variables
    public LinkedListNode head;
    public LinkedListNode current,tail;
    public int position,size;
    
    //Constructores
    public LinkedList(){
        this.head = new LinkedListNode();
        this.current = this.head;
        this.tail = this.head;
        this.size = 0;
        this.position = -1;
    }
    //metodos de la clase
    //Agregar elemento en cualquier parte de la lista
    public void insert(Particion element) {
        LinkedListNode newNode = new LinkedListNode(element, this.current.getNext());
        this.current.setNext(newNode);
        
        if (this.current == this.tail) {
            this.tail = tail.getNext();
        }
        this.size++;
    }
    //Agregar elemento al final de la lista
    public void append(Particion element) {
        System.out.println("Se esta insertando el elemento");
        LinkedListNode newNode = new LinkedListNode(element);
        System.out.println("Se crea nodo");
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.size++;
    }
    //Eliminar elemento de
    public void remove() {
        if ((this.head == this.current) && (this.head == this.tail)){
            System.out.println("Lista vacía, no se puede remover ningún elemento");
            return;
        } 
        LinkedListNode temp = head;
        while (temp.getNext() != this.current) {
            temp = temp.getNext();
        }
        temp.setNext(this.current.getNext());
        if (this.current == this.tail) {
            this.current = this.tail = temp;
            this.position--;
        }
        else
            this.current = this.current.getNext();
        this.size--;
    }
    
    //Eliminar todos los elmentos de la lista
    public void clear() {
        this.head = this.tail = this.current = new LinkedListNode();
        this.position = -1;
        this.size = 0;
    }
    //otros Metodos de la clase
    public Object getElement(){
        return this.current.getElement();
    }

    public int getSize() {
        return this.size;
    }

    public boolean next() {
        if (this.current == this.tail) {
            System.out.println("Actualmente en último nodo, no se puede avanzar");
            return false;
        }
        this.current = this.current.getNext();
        this.position++;
        return true;
    }   

    public void goToStart(){
        this.current = this.head;
        this.position = -1;
    }


}