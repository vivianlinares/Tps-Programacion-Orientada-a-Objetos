/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author cosito
 */
public class ProductoQueCaduca extends Producto{
    private int meses;

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
    @Override
    public double precioConIVA(double IVA){
        return this.getPrecio() * IVA;
    }
}
