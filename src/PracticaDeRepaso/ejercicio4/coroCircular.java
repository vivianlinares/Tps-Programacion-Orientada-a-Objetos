/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaDeRepaso.ejercicio4;

/**
 *
 * @author cosito
 */
public class coroCircular extends Coro {
   private Corista []coristas;
   private int dml =0;
   public coroCircular(Director director, int cantCoristas){
      super(director,cantCoristas); 
      coristas = new Corista[cantCoristas];
   } 
/*o En el coro semicircular los coristas se deben ir agregando de izquierda
a derecha*/
   @Override
   public void agregarCorista(Corista corista){
       coristas[dml] = corista;
       dml++;
   }
   @Override
   public boolean estaLleno(){
       if(getDmf() == dml){
         return true;  
       }else
           return false;
   }
}
