/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.EstacionMain;

/**
 */
public class Estacion {
   private String direccion;
   private Surtidor []vector;
   private int N;
   private int dml= 0;
    public Estacion(String direccion, int N) {
        this.direccion = direccion;
        this.N = N;
        vector = new Surtidor[N];
    }
   public void agregarSurtidor(Surtidor surtidor){
        vector[this.dml]=surtidor;
        this.dml++;
    }
   public void agregarSurtidor(int N, int dni, int litros,String tipoPago){
       Venta venta = new Venta(dni, litros, tipoPago);
       vector[N] = venta;
    }
   
}
