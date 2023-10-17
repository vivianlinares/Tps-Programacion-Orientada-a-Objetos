/*
 1- Analice el programa Ej01Tabla2.java, que carga un vector que representa la
tabla del 2. Luego escriba las instrucciones necesarias para:
- generar enteros aleatorios hasta obtener el número 11. Para cada número
muestre el resultado de multiplicarlo por 2 (accediendo al vector).
 */
package tema1;

import PaqueteLectura.GeneradorAleatorio;

public class Ej01Tabla2 {

    /**
     * Carga un vector que representa la tabla del 2
     */
    public static void main(String[] args) {
        int DF=11;  
        int numero= GeneradorAleatorio.generarInt(12);
        int [] tabla2 = new int[DF]; // indices de 0 a 10
        int i;
        for (i=0;i<DF;i++){ 
            tabla2[i]=2*i;
             System.out.println("2x" + i + "="+ tabla2[i]);
         }
        System.out.println("-----------");
        while(numero != 11){
             System.out.println("2x" + numero + "="+ tabla2[numero]);
             numero= GeneradorAleatorio.generarInt(12);
        }
    }
    
}
