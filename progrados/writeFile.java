/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progrados;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author luisg
 */
public class writeFile {
        public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("agregarLugarDeAlmacenamiento.txt", true);
            writer.write("Hello World");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
}
