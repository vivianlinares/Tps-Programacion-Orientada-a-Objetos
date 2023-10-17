/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 */
public abstract class Producto {
    private double precio = 10;
    private String nombre;
    private String descripcion = " sin ";
    private Fabrica fabricante;
    public abstract double precioConIVA(double IVA);
      
    public Producto(String nombre, double precio, Fabrica fabricante){
        this.nombre = nombre;
        this.precio = precio;
        this.fabricante = fabricante;
    }
    public Producto(String nombre){
        this.nombre = nombre;
    }
    public Producto(){
        nombre ="vacio";
        precio = 0.01;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Fabrica getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabrica fabricante) {
        this.fabricante = fabricante;
    }
    
}
