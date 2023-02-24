/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author cristina
 */
public class FicheroIn {
    private FileReader f;
    private BufferedReader br;
    private int c; // letra para ir leyendo
    
    public FicheroIn(String nom) {

    }
    
    public void cerrar() {

    }
    
    public String leerTodoLineaALinea() throws Exception{
        String s ="";
        String l = br.readLine();
        while (l != null){
            s = s + l + '\n';
            l = br.readLine();
        }
        return s;
        
    }
    
    public Palabra leerPalabra() throws Exception{
        Palabra aux = new Palabra(); //  la que se va a devovler
        //coloco sobre el primer char
        //mientras no estoy sobre el primer char de la palabra o final
         // mientras no final y char de palabra 
            //inserta letra en palabra
            //lee siguiente char
        
        return aux;
    }
    
    private void saltarBlancosYOtros() throws Exception{
         // mientras no final de fichero y c <= 32 (espacio o cualquier otro char)
  
    }
}
