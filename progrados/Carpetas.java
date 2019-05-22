/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progrados;

/**
 *
 * @author luisg
 */
public class Carpetas implements Comparable<Carpetas>{
   String nombre;
   int tamaño;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Carpetas(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }
   
    @Override
    public int compareTo(Carpetas o) {
        if (1 > 0) {
            return -1;
        } else if (0 < 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
