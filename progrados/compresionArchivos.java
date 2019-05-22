package progrados;
import java.io.*;
import java.util.zip.*;
import javax.swing.JOptionPane;
public class compresionArchivos {

    public static void compress(File source, File destination) throws IOException{
                
        byte[] buffer = new byte[1024];
        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(destination);
        GZIPOutputStream gzos = new GZIPOutputStream(fos);
        int read;
        
        while((read = fis.read(buffer)) != -1){
            gzos.write(buffer, 0, read);
        }
        gzos.finish();
        gzos.close();
        fos.close();
        fis.close();
    }
    
    public static void files(){
        String lugar = JOptionPane.showInputDialog("Ingrese la dirección del archivo a comprimir: ");
        String destino = JOptionPane.showInputDialog("Ingrese la dirección del nuevo archivo y el nombre: ");
        File source = new File(lugar);
        File destination = new File(destino);
        try{
        compress(source, destination);
        
        }
        
        catch(IOException e){
             System.out.println(e);
    }
    
    }
}