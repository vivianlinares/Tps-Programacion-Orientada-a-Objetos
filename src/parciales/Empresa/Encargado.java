/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.Empresa;

public class Encargado extends Empleado{
    private int cantEmpleado;

    public Encargado(String nombre, int dni, int ingresoAnio, double sueldoBasic, int cantEmpleado) {
        super(nombre, dni, ingresoAnio, sueldoBasic);
        this.cantEmpleado = cantEmpleado;
        
    }

    public int getCantEmpleado() {
        return cantEmpleado;
    }

    public void setCantEmpleado(int cantEmpleado) {
        this.cantEmpleado = cantEmpleado;
    }
    
    @Override
    public double sueldoACobrar(){
         double aux;double aux1 = getSueldoBasic(), antiguedad = 2023 - getIngresoAnio();
       if(antiguedad > 20){
           aux1 = aux1 +(getSueldoBasic()*0.1);
       }
         aux = 2000*getCantEmpleado() + aux1;
         return aux;
     }

    @Override
    public String toString() {
        return super.toString()+" año de ingreso: "+this.getIngresoAnio();
    }
    
}
