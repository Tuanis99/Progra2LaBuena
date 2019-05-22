package progrados;
import java.io.*;

public class crearArchivoTxt {
    public void crearArchivo(){
        try{
            File file = new File("C:\\Users\\Catalina\\Documents\\progra");

            boolean fvar = file.createNewFile();
            if (fvar){
                System.out.println("Se ha creado el archivo");
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
}
        
//    public static void main(String[] args) {
//        try{
//            File file = new File("agregarLugarDeAlmacenamiento");
//
//            boolean fvar = file.createNewFile();
//            if (fvar){
//                System.out.println("Se ha creado el archivo");
//	    }
//	    else{
//                System.out.println("Ya existe un archivo con ese nombre en la ubicación seleccionada");
//	    }
//    	} 
//        catch(IOException e){
//            System.out.println("Excepción");
//	    e.printStackTrace();
//	}
//   }
