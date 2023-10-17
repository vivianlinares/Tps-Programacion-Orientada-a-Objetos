/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.ejercicio5;

import tema4.Cuadrado;
import tema4.Rectangulo;

/**
 */
public class MainVisorFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VisorFigurasModificado visor; 
        visor = new VisorFigurasModificado();
         Cuadrado c1 = new Cuadrado(10,"Violeta","Rosa");
         Rectangulo r= new Rectangulo(20,10,"Azul","Celeste");
         Cuadrado c2= new Cuadrado(30,"Rojo","Naranja"); 
         visor.guardar(r);
        visor.guardar(c1);
        visor.guardar(c2);
        visor.mostrar();
    }
    
}
