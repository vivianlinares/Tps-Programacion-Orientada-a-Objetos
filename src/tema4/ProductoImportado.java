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
public class ProductoImportado extends ProductoQueCaduca{
    private String paisDeDondeViene;
    public String getPaisDeDondeViene() {
        return paisDeDondeViene;
    }

    public void setPaisDeDondeViene(String paisDeDondeViene) {
        this.paisDeDondeViene = paisDeDondeViene;
    }
    public String ToString(){
        return " pais del producto: "+paisDeDondeViene+" meses para el venci"+getMeses();
    }
    @Override
    public double precioConIVA(double IVA){
        return this.getPrecio() * IVA * 1.40;
    }
}
