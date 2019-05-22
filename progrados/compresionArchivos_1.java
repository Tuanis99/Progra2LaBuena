package progrados;
import java.io.*;
import java.util.zip.*;
import javax.swing.JOptionPane;
public class compresionArchivos {
    
    public static void hola(){
        String y = JOptionPane.showInputDialog("Ingrese la dirección y nombre del archivo a comprimir: ");
        String x = JOptionPane.showInputDialog("Ingrese la dirección y el nombre del archivo comprimido");
        File source = new File(y);
        File destination = new File(x);
        try{
            compress(source, destination);
        
        }
        
        catch(IOException e){
             System.out.println(e);
        }
    
    }
    
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
}