/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.ejercicio5;

import tema4.Figura;

public class VisorFigurasModificado {
 private int guardadas;
 private int capacidadMaxima=5;
 private Figura [] vector;

 public VisorFigurasModificado(){
     guardadas = 0;
     vector = new Figura[capacidadMaxima];
 }

 public void guardar(Figura f){
     vector[guardadas] = f;
     guardadas++;
 }

  public boolean quedaEspacio(){
  if (guardadas < capacidadMaxima){
      return true;
  }else{
      return false;
  }
 }

 public void mostrar(){
     for (int i = 0; i < getGuardadas(); i++) {
         System.out.println(vector[i].toString());
     }
 }
 public int getGuardadas() {
 return guardadas;
 }

}
