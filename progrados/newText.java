/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.cracked
 */
package progrados;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author luisg
 */
public class newText {
    public static void main (String [] args){
    //public static void crear(){
        BufferedReader br = null;
        try{
            String fileName = JOptionPane.showInputDialog("Ingrese la dirección y nombre del archivo a comprimir: ");
            br = new BufferedReader(new FileReader(fileName));
            String line;
            
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        
        catch(IOException e){
            e.printStackTrace();
        }
        
        finally{
            try{
                br.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            
        }
    }    
}
