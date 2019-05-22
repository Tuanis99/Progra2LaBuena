package progrados;
import java.io.*;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class crearArchivoTxt {
    public void crearArchivo(){
        try{
            File file = new File("C:\\Users\\Catalina\\Documents\\progra");

            boolean fvar = file.createNewFile();
            if (fvar){
                JOptionPane.showMessageDialog(null, "Se ha creado el archivo", "Error", JOptionPane.PLAIN_MESSAGE);
	    }
	    else{
                System.out.println("Ya existe un archivo con ese nombre en la ubicación seleccionada");
	    }
    	} 
        catch(IOException e){
            System.out.println("Excepción");
	    e.printStackTrace();
	}
   }

        
    public static void main(String[] args) {
        try{
            File file = new File("agregarLugarDeAlmacenamiento.txt");

            boolean fvar = file.createNewFile();
            if (fvar){
                System.out.println("Se ha creado el archivo");
	    }
	    else{
                System.out.println("Ya existe un archivo con ese nombre en la ubicaciÃ³n seleccionada");
	    }
    	} 
        catch(IOException e){
            System.out.println("ExcepciÃ³n");
	    e.printStackTrace();
	}
   }
   }
