/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progrados;

//import APIS.DropboxUpload;
import Estructuras.AVLTree;
import Estructuras.AVLTree.NodeAVL;
import UI.menuInicial;
//import com.dropbox.core.DbxException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
//import static progrados.prograDos.listaParticiones;


/**
 *
 * @author luisg
 */
public class Comandos {
            public static void cd(){
                String nombreP = JOptionPane.showInputDialog("Ingrese en nombre de la particion que desea buscar: ");
                prograDos.listaParticiones.goToStart();
                prograDos.listaParticiones.current=prograDos.listaParticiones.current.getNext();
                while (prograDos.listaParticiones.current!=null){
                    if(prograDos.listaParticiones.current.getElement().nombre.equals(nombreP)){
                        //AVLTree currentP = prograDos.listaParticiones.current.element.arbol;
                        String nodoP = JOptionPane.showInputDialog("Ingrese en nombre de la particion que desea buscar: ");
                        NodeAVL docEncontrado = prograDos.listaParticiones.current.element.arbol.find(nodoP);
                        System.out.print(docEncontrado.toString());
                        break;
                    }
                    prograDos.listaParticiones.current = prograDos.listaParticiones.current.getNext();
                }
            }
            
            //crea nuevo directorio
            public static void mkdir (){
                String nombreP = JOptionPane.showInputDialog("Ingrese en nombre de la particion que desea buscar: ");
                prograDos.listaParticiones.goToStart();
                prograDos.listaParticiones.current=prograDos.listaParticiones.current.getNext();
                while (prograDos.listaParticiones.current!=null){
                    if(prograDos.listaParticiones.current.getElement().nombre.equals(nombreP)){
                        //prograDos.listaParticiones.current.element.arbol;
                        String nombreDirectorio = JOptionPane.showInputDialog("Ingrese en nombre del directorio: ");
                        int tamañoIngreso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese en tamaño del directorio: "));
                        Carpetas nuevaCarpeta = new Carpetas (nombreDirectorio,tamañoIngreso);
                        prograDos.listaParticiones.current.element.arbol.addAVL(nuevaCarpeta);
                        break;
                    }
                    prograDos.listaParticiones.current = prograDos.listaParticiones.current.getNext();
                }
            }
            //copia nuevo archivo
            public static void copy (){
                String nombreP = JOptionPane.showInputDialog("Ingrese en nombre de la particion que desea buscar: ");
                prograDos.listaParticiones.goToStart();
                prograDos.listaParticiones.current=prograDos.listaParticiones.current.getNext();
                while (prograDos.listaParticiones.current!=null){
                    if(prograDos.listaParticiones.current.getElement().nombre.equals(nombreP)){
                        //AVLTree currentP = prograDos.listaParticiones.current.element.arbol;
                        String nombreArchivoCopiar = JOptionPane.showInputDialog("Ingrese en nombre del archivo que desea copiar ");
                        NodeAVL docEncontrado = prograDos.listaParticiones.current.element.arbol.find(nombreArchivoCopiar);
                        String nuevaParticion = JOptionPane.showInputDialog("Ingrese en nombre de la particion donde desea copiar: ");
                        prograDos.listaParticiones.goToStart();
                        prograDos.listaParticiones.current= prograDos.listaParticiones.current.getNext();
                        while (prograDos.listaParticiones.current!=null){
                            if(prograDos.listaParticiones.current.getElement().nombre==nuevaParticion){
                                prograDos.listaParticiones.current.element.arbol.addAVL(docEncontrado);
                                break;
                            }
                        }
                        //encontradolista=true;
                        break;
                    }
                    prograDos.listaParticiones.current = prograDos.listaParticiones.current.getNext();
                }
            }
            //mueve directorio completo
            //utlizar pila para guardar los elementos
            public static void mvdir (){
                String nombreP = JOptionPane.showInputDialog("Ingrese en nombre de la particion que desea buscar: ");
                prograDos.listaParticiones.goToStart();
                prograDos.listaParticiones.current=prograDos.listaParticiones.current.getNext();
                while (prograDos.listaParticiones.current!=null){
                    if(prograDos.listaParticiones.current.getElement().nombre.equals(nombreP)){
                        String nombreArchivoCopiar = JOptionPane.showInputDialog("Ingrese en nombre de la particion que desea mover: ");
                        NodeAVL docEncontrado = prograDos.listaParticiones.current.element.arbol.find(nombreArchivoCopiar);
                        String destino = JOptionPane.showInputDialog("Ingrese en nombre de la particion donde mover: ");
                        break;
                    }
                    prograDos.listaParticiones.current = prograDos.listaParticiones.current.getNext();
                }
            }
            //Elimina un directorio
            public static void rmdir(){
                String nombreP = JOptionPane.showInputDialog("Ingrese en nombre de la particion que desea buscar: ");
                prograDos.listaParticiones.goToStart();
                prograDos.listaParticiones.current=prograDos.listaParticiones.current.getNext();
                while (prograDos.listaParticiones.current!=null){
                    if(prograDos.listaParticiones.current.getElement().nombre.equals(nombreP)){
                        AVLTree currentP = prograDos.listaParticiones.current.element.arbol;
                        System.out.println("Ingrese el directorio que quiere eliminar ");
                        String archivoEliminar = JOptionPane.showInputDialog("Ingrese en nombre del directorio que desea eliminar: ");
                        NodeAVL eliminarNodo = prograDos.listaParticiones.current.element.arbol.find(archivoEliminar);
                        prograDos.listaParticiones.current.element.arbol.deleteAllNode(eliminarNodo);
                        //encontradolista=true;
                        break;
                    }
                    prograDos.listaParticiones.current = prograDos.listaParticiones.current.getNext();
                }
            }
            
                        //crea nuevo file
            public static void crfile(){
                String nombreP = JOptionPane.showInputDialog("Ingrese en nombre de la particion que desea buscar: ");
                prograDos.listaParticiones.goToStart();
                prograDos.listaParticiones.current=prograDos.listaParticiones.current.getNext();
                while (prograDos.listaParticiones.current!=null){
                    if(prograDos.listaParticiones.current.getElement().nombre.equals(nombreP)){
                        //AVLTree currentP = prograDos.listaParticiones.current.element.arbol;
                        String nombreA = JOptionPane.showInputDialog("Ingrese el nombre que desea darle al archivo");
                        int tamañoP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño que desea otorgarle al archivo"));
                        Archivos newFile = new Archivos (nombreA,tamañoP);
                        prograDos.listaParticiones.current.element.arbol.addAVL(newFile);
                        //encontradolista=true;
                        break;
                    }
                    prograDos.listaParticiones.current = prograDos.listaParticiones.current.getNext();
                }
            }
            
            //mueve archivo
            public static void move(){
                String nombreP = JOptionPane.showInputDialog("Ingrese en nombre de la particion que desea buscar: ");
                prograDos.listaParticiones.goToStart();
                prograDos.listaParticiones.current=prograDos.listaParticiones.current.getNext();
                while (prograDos.listaParticiones.current!=null){
                    if(prograDos.listaParticiones.current.getElement().nombre.equals(nombreP)){
                        //AVLTree currentP = prograDos.listaParticiones.current.element.arbol;
                        String nombreArchivo = JOptionPane.showInputDialog("Ingrese en nombre del archivo que desea mover ");
                        NodeAVL docEncontrado = prograDos.listaParticiones.current.element.arbol.find(nombreArchivo);
                        prograDos.listaParticiones.current.element.arbol.delete(docEncontrado);
                        String nuevaParticion = JOptionPane.showInputDialog("Ingrese en nombre de la particion donde desea mover: ");
                        prograDos.listaParticiones.goToStart();
                        prograDos.listaParticiones.current= prograDos.listaParticiones.current.getNext();
                        while (prograDos.listaParticiones.current!=null){
                            if(prograDos.listaParticiones.current.getElement().nombre.equals(nuevaParticion)){
                                prograDos.listaParticiones.current.element.arbol.addAVL(docEncontrado);
                                break;
                            }
                        }
                        //encontradolista=true;
                        break;
                    }
                    prograDos.listaParticiones.current = prograDos.listaParticiones.current.getNext();
                }
            }
            //imprime arbol en consola
            //revisar el arbol funcion print
            public static void tree (){
                String nombreP = JOptionPane.showInputDialog("Ingrese en nombre de la particion que desea imprimir: ");
                prograDos.listaParticiones.goToStart();
                prograDos.listaParticiones.current=prograDos.listaParticiones.current.getNext();
                while (prograDos.listaParticiones.current!=null){
                    if(prograDos.listaParticiones.current.getElement().nombre.equals(nombreP)){
                        AVLTree currentP = prograDos.listaParticiones.current.element.arbol;
                        NodeAVL searchP= prograDos.listaParticiones.current.element.arbol.find(currentP);
                        prograDos.listaParticiones.current.element.arbol.printTree(searchP);
                        //encontradolista=true;
                        break;
                    }
                    prograDos.listaParticiones.current = prograDos.listaParticiones.current.getNext();
                }
            }
            //imprime nodos del directorio
            public static void dir (){
                String nombreP = JOptionPane.showInputDialog("Ingrese en nombre de la particion que desea buscar: ");
                prograDos.listaParticiones.goToStart();
                prograDos.listaParticiones.current=prograDos.listaParticiones.current.getNext();
                while (prograDos.listaParticiones.current!=null){
                    if(prograDos.listaParticiones.current.getElement().nombre.equals(nombreP)){
                        //AVLTree currentP = prograDos.listaParticiones.current.element.arbol;
                        String printNode = JOptionPane.showInputDialog("Ingrese en nombre del directorio que desea imprimir: ");
                        NodeAVL searchP= prograDos.listaParticiones.current.element.arbol.find(printNode);
                        prograDos.listaParticiones.current.element.arbol.printTree(searchP);
                        //encontradolista=true;
                        break;
                    }
                    prograDos.listaParticiones.current = prograDos.listaParticiones.current.getNext();
                }
            }
                //elimina un archivo
            public static void rmfile(){
                String nombreP = JOptionPane.showInputDialog("Ingrese en nombre de la particion que desea buscar: ");
                prograDos.listaParticiones.goToStart();
                prograDos.listaParticiones.current = prograDos.listaParticiones.current.getNext();
                while (prograDos.listaParticiones.current != null){
                    if(prograDos.listaParticiones.current.getElement().nombre.equals(nombreP)){
                        AVLTree currentP = prograDos.listaParticiones.current.element.arbol;
                        String directorioEliminar=JOptionPane.showInputDialog("Ingrese el archivo que quiere eliminar ");
                        NodeAVL eliminarNodo = prograDos.listaParticiones.current.element.arbol.find(directorioEliminar);
                        prograDos.listaParticiones.current.element.arbol.deleteAllNode(eliminarNodo);
                    }
                    prograDos.listaParticiones.current = prograDos.listaParticiones.current.getNext();
                }
            }
                //cambia nombre
            public static void rename(){
                String nombreP = JOptionPane.showInputDialog("Ingrese en nombre de la particion que desea buscar: ");
                prograDos.listaParticiones.goToStart();
                prograDos.listaParticiones.current=prograDos.listaParticiones.current.getNext();
                while (prograDos.listaParticiones.current!=null){
                    if(prograDos.listaParticiones.current.getElement().nombre.equals(nombreP)){
                        AVLTree currentP = prograDos.listaParticiones.current.element.arbol;
                        String nodoBuscar = JOptionPane.showInputDialog("Ingrese el nombre del archivo que desea renombrar");
                        NodeAVL nodoEncontrado = prograDos.listaParticiones.current.element.arbol.find(nodoBuscar);
                        String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del nodo que desea ");
                    //    encontradolista = true;
                        break;
                    }
                    prograDos.listaParticiones.current = prograDos.listaParticiones.current.getNext();
                }
            }
            
            public static void call(){
                String nombreP = JOptionPane.showInputDialog("Ingrese en nombre de la particion que desea buscar: ");
                prograDos.listaParticiones.goToStart();
                prograDos.listaParticiones.current=prograDos.listaParticiones.current.getNext();
                while (prograDos.listaParticiones.current!=null){
                    if(prograDos.listaParticiones.current.getElement().nombre.equals(nombreP)){
                        //AVLTree currentP = prograDos.listaParticiones.current.element.arbol;
                        String nombreA = JOptionPane.showInputDialog("Ingrese el nombre que desea darle al archivo");
                        int tamañoP = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño que desea otorgarle al archivo"));
                        Archivos newFile = new Archivos (nombreA,tamañoP);
                        prograDos.listaParticiones.current.element.arbol.addAVL(newFile);
                        //encontradolista=true;
                        break;
                    }
                    prograDos.listaParticiones.current = prograDos.listaParticiones.current.getNext();
                }
            }
                //sube a la nube
            public static void drive() /*throws DbxException, IOException*/{
                String nombreArchivo = JOptionPane.showInputDialog("Ingrese en nombre del archivo que desea subir a la nube ");
//                DropboxUpload.uploadFile();
                
            }
        } 
