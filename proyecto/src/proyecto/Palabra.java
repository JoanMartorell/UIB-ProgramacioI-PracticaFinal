package proyecto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mascport
 */
public class Palabra {

    private final int max = 11;
    private char[] pal;
    private int n;

    public Palabra() {
        pal = new char[max];
        n = 0;
    }

    public void anadirCaracter(char c) {
        pal[n++] = c;
    }

    public boolean vacia() {
        return (n == 0);
    }
    
    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < n; i++) {
            res = res + pal[i];
        }
        return res;
    }
    
    public int convertir(){ // convierte a num todo
        System.out.println(":)");
        return 69;
    }
}
