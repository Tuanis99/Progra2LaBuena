package progrados;
import java.io.*;
import java.lang.*;
import java.util.*;
import javax.swing.*;
public class createFile {
    private Formatter x;
    
    String nombre = JOptionPane.showInputDialog("Ingrese en nombre del archivo: ");
    
    public void openFile (){
        try{
            x = new Formatter(nombre);   
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hay un error", "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }
    public void addRecords(){
        x.format("%s%s%s", "20", "bucky", "roberts");
    }
    
    public void closeFile(){
        x.close();
    }
}