/*
  Cualquier empleado se caracteriza por su nombre, sueldo básico y antigüedad.
 */
package tema4;

/**

 */
public abstract class Empleado {
    private String nombre;
    private double sueldo;
    private int antiguedad;
    public Empleado(String nombre, double sueldo,int antiguedad){
        this.antiguedad = antiguedad;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
/*D- Cualquier empleado debe responder al mensaje toString, que devuelve un String que
lo representa, compuesto por nombre, sueldo a cobrar y efectividad.*/
    @Override
    public String toString(){
        String aux = "nombre: "+nombre+
                    "sueldo: "+this.calcularSueldoACobrar()+
                    "efectividad: "+this.calcularEfectividad();
        return aux;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    /*Cualquier empleado debe responder al mensaje calcularEfectividad. La efectividad
del entrenador es el promedio de campeonatos ganados por año de antigüedad, mientras
que la del jugador es el promedio de goles por partido.*/
    public abstract double calcularEfectividad();
    /*C- Cualquier empleado debe responder al mensaje calcularSueldoACobrar. El sueldo a
cobrar es el sueldo básico más un 10% del básico por cada año de antigüedad y además:
 Para los jugadores: si el promedio de goles por partido es superior a 0,5 se adiciona un
plus de otro sueldo básico.*/
    public abstract double calcularSueldoACobrar();
    
}
