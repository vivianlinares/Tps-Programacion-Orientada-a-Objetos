/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.Empresa;

public class Director extends Empleado {
    private double viatico;

    public Director(String nombre, int dni, int ingresoAnio, double sueldoBasic, double viatico) {
        super(nombre, dni, ingresoAnio, sueldoBasic);
        this.viatico = viatico;
    }

    public double getViatico() {
        return viatico;
    }

    public void setViatico(double viatico) {
        this.viatico = viatico;
    }
    
    @Override
     public double sueldoACobrar(){
         double aux;double aux1= getSueldoBasic(), antiguedad = 2023 - getIngresoAnio();
       if(antiguedad > 20){
           aux1 = aux1 +(getSueldoBasic()*0.1);
       }
         aux = getViatico() + aux1;
         return aux;
     }
    @Override
    public String toString(){
        return super.toString()+"año de ingreso: "+this.getIngresoAnio();
    }
}
