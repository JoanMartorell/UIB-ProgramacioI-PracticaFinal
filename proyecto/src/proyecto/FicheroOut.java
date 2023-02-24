/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.io.*;

/**
 *
 * @author joanm
 */
public class FicheroOut {
    private FileWriter f;
    private BufferedWriter bw;
    
    public FicheroOut(String nom) throws Exception {
        f = new FileWriter(nom);
        bw = new BufferedWriter(f);
    }
    
    public void cerrar() throws Exception {
        bw.close();
        f.close();
    }
    
    public void escribirPalabra(Palabra p) {
        
    }
    
    public void escribirString(String s) throws Exception {
        bw.write(s);
        bw.newLine();
    }
}
