/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;
import PaqueteLectura.Lector;
/**
 *
 * @author cosito
 */
public class prueba {
     public static void main(String[] args) {
         int dmlFila=0;
         int dmlCol; int j;
         int dmfFila = 2; int dmfCol = 2; int dia;
         String [][] tabla = new String[dmfFila][dmfCol];
         String nombre;
         String fin = "zzz";
         System.out.println("ingresar nombre "); nombre = Lector.leerString();   
         System.out.println("dia:");
         dia = Lector.leerInt();
         int cant = 0;                         
         while((nombre.equals(fin) == false)&&(cant < (dmfFila * dmfCol))){
                j=0;
                
                 while(( j < dmfCol )&&(tabla[dia][j] != null)){
                        j++;
                 }
                 if (j < dmfCol && tabla[dia][j] == null){
                     
                     tabla[dia][j] = nombre;
                     System.out.println("se guardo en la pos: "+dia+","+j);
                     cant ++;
                 }else{
                     
                     System.out.println("no se encontro turno para el dia: "+dia);
                     
                 }
                
                System.out.println("nombre: ");
                nombre = Lector.leerString();
                if (nombre.equals(fin) == false){
                    System.out.println("dia:");
                    dia = Lector.leerInt();
                }
         }
         
        /* while((nombre.equals(fin) == false)&&(dmlFila < dmfFila)){
             dmlCol =0;
             while((nombre.equals(fin) == false)&&(dmlCol < dmfCol)){
     
                  tabla[dmlFila][dmlCol]=nombre;
                  dmlCol++;
                  System.out.println("ingresar nombre:  ("+dmlFila+","+dmlCol+")"); nombre = Lector.leerString();
             }
             dmlFila ++;
         }*/
         System.out.println("---");
         
         for (int i = 0; i < dmfFila; i++){
              System.out.println("_______");
             for(int h =0; h < dmfCol; h++){
                 if (tabla[i][h] != null){
                     System.out.print(tabla[i][h]+"-");
                 }
                 
            }
            System.out.println();
        }
     }
     
}
