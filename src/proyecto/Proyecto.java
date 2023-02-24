/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author joanm
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    
    LT lector = new LT();
    
    public static void main(String[] args) {
        Proyecto p = new Proyecto();
        p.inicio();
    }
    
    public void inicio() {
        Proyecto p = new Proyecto();
        
        int opcion;
        
        System.out.println(" __________________________________");
        System.out.println("");
        System.out.println(" | ********** SCRABBLE ********** |");
        System.out.println(" __________________________________");
        System.out.println(" |       ¿Qué deseas hacer?       |");
        System.out.println(" |                                |");
        System.out.println(" |        [1]  JUGAR              |");
        System.out.println(" |    [2]  VER ESTADÍSTICA        |");
        System.out.println(" |         [3]  SALIR             |");
        System.out.println(" |________________________________|");
        System.out.println("");
        System.out.println("OPCIÓN ELEGIDA:");
        
        opcion = lector.leerEntero();
        
        
        if (opcion < 1 || opcion > 3) {
            System.out.println(" [ERROR] Opción incorrecta, vuelva a intentarlo: ");
            p.inicio();
        } else {
            switch (opcion) {
                case 1: p.jugar(); break;
                case 2: p.estadisticas(); break;
                default: break;
            }
        }
    }
    
    private void jugar() {
        int modo;
        int rondas;
        
        System.out.println(" __________________________________");
        System.out.println("");
        System.out.println(" | ********** SCRABBLE ********** |");
        System.out.println(" __________________________________");
        System.out.println(" |    ¿Qué modo deseas jugar?     |");
        System.out.println(" |                                |");
        System.out.println(" |       [1]  INDIVIDUAL          |");
        System.out.println(" |       [2]  SIMULADOR           |");
        System.out.println(" |       [3]  SUPERCEREBRO        |");
        System.out.println(" |________________________________|");
        System.out.println("");
        System.out.println("MODO DE JUEGO ELEGIDO:");
        
        modo = lector.leerEntero();
        
        System.out.println("");
        System.out.println("¿CUANTAS RONDAS DESEAS JUGAR?:");
        rondas = lector.leerEntero();
    }
    
    private void estadisticas() {
        System.out.println(" Estadisticas"); 
    }
    
}
