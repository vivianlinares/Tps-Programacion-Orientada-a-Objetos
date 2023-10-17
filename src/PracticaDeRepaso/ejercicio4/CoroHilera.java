/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaDeRepaso.ejercicio4;

/**
 *
 */
public class CoroHilera extends Coro {
    private int hilera;
    private int integrantes;
    private Corista [][]coristas;
    private int dmlhilera= 0,dmlintegrante=0;
    
    /* la cantidad de hileras e integrantes por
hilera (en el caso del coro por hileras). */
    public CoroHilera(Director director, int cantHilera, int integrantes){
      super(director); 
      this.hilera = cantHilera;
      this.integrantes = integrantes;
      coristas = new Corista[this.hilera][this.integrantes];
    }

    public int getHilera() {
        return hilera;
    }

    public void setHilera(int hilera) {
        this.hilera = hilera;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

   
    
    @Override
   public void agregarCorista(Corista corista){
       if(dmlhilera < getHilera()){
        if(dmlintegrante < getIntegrantes()){
            this.coristas[dmlhilera][dmlintegrante] = corista;
            dmlintegrante++;
        }
       }
        
   }
    @Override
   public boolean estaLleno(){
       return true;
   }
}
