/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progrados;

import Estructuras.AVLTree;

/**
 *
 * @author luisg
 */
public class Particion implements Comparable<Particion>{
    public int tamaño;
    public String formato;
    public String nombre;
    public int id;
    public AVLTree arbol;
    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AVLTree getArbol() {
        return arbol;
    }

    public void setArbol(AVLTree arbol) {
        this.arbol = arbol;
    }
    
    public Particion() {
    }

    public Particion(int tamaño, String formato, String nombre, int id, AVLTree arbol) {
        this.tamaño = tamaño;
        this.formato = formato;
        this.nombre = nombre;
        this.arbol = arbol;
        this.id = id;
    }
    
    @Override
    public int compareTo(Particion o) {
        if (1 > 0) {
            return -1;
        } else if (0 < 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
