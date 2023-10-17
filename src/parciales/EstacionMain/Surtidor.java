/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.EstacionMain;

/**
 */
public class Surtidor {
    private String combustible;
    private double precio;
    private Venta []vectorVenta;
    private int V;
    private int dml=0;

    public Surtidor(String combustible, double precio, int v) {
        this.combustible = combustible;
        this.precio = precio;
        this.V = v;
        vectorVenta = new Venta[V];
    }
    public void agregarVenta(Venta venta){
        vectorVenta[dml] = venta;
        dml++;
    }
}
