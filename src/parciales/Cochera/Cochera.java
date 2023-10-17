/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.Cochera;

/**
 *
 * @author cosito
 */
public abstract class Cochera {
   private Coche [][]cochera;
   private double costohora;
   private int dml1 = 0;

    public Cochera(double costohora) {
        this.costohora = costohora;
        this.cochera = new Coche[2][10];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 10; j++) {
                cochera[i][j] = null;
            }
        }
    }
   
    public double getCostohora() {
        return costohora;
    }

    public void setCostohora(double costohora) {
        this.costohora = costohora;
    }
   /*a), Ingresar un coche C en el primer lugar líbre de un sector. Asuma que seguro existe un lugar
libre. Devuelva el nro. del lugar que ocupará en el sector.*/
    public int insertarCoche(int sector, Coche coche){
        cochera[sector][dml1] =coche;
        dml1++;
        return dml1;
    }
    /*b) Ingresar un coche C a la cochera. El coche se ingresa al sector inferior si estará menos de 24
hrs, y en caso contrario se ingresa al sector superior. Asuma que hay espacio en ambos
sectores. Devuelva el nro. del lugar que ocupará en el sector.*/
    public int insertarCoche(Coche coche){
        if(coche.getCantHoras() < 24){
            cochera[1][dml1] = coche;
            dml1++;
        }else{
            this.insertarCoche(2, coche);
        }
        return dml1++;
    }
}
