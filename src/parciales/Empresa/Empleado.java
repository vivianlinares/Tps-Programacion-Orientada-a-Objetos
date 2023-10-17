
package parciales.Empresa;

public abstract class Empleado {
   private String  nombre;
   private int dni;
   private int ingresoAnio;
   private double sueldoBasic;

    public Empleado(String nombre, int dni, int ingresoAnio, double sueldoBasic)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.ingresoAnio = ingresoAnio;
        this.sueldoBasic = sueldoBasic;
    }

    public int getIngresoAnio() {
        return ingresoAnio;
    }
    public void setIngresoAnio(int ingresoAnio) {
        this.ingresoAnio = ingresoAnio;
    }
    public double getSueldoBasic() {
        return sueldoBasic;
    }
    public void setSueldoBasic(double sueldoBasic) {
        this.sueldoBasic = sueldoBasic;
    }
    public abstract double sueldoACobrar();
    /*
   public double sueldoACobrar(){
       double aux = getSueldoBasic(), antiguedad = 2023 - getIngresoAnio();
       if(antiguedad > 20){
           aux = aux +(getSueldoBasic()*0.1);
       }
       return aux;
   }
*/
    @Override
    public String toString() {
        return  "nombre=" + nombre + ", dni=" + dni + ", sueldoBasic=" + this.sueldoACobrar() ;
    }
  
}
