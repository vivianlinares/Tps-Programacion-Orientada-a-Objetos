/*
  Los jugadores son empleados que se caracterizan por el número de partidos jugados y
el número de goles anotados.
 */
package tema4;

/**
 *
 *
 */
public class Jugador extends Empleado{
    private int Partidos;
    private int goles;
    public Jugador(String nombre, double sueldo,int antiguedad,int partidos, int goles){
        super(nombre,sueldo,antiguedad);
        this.Partidos = partidos;
        this.goles = goles;
    }
    public int getPartidos() {
        return Partidos;
    }

    public void setPartidos(int Partidos) {
        this.Partidos = Partidos;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    @Override
    public double calcularEfectividad(){
        double aux  =(double) getGoles() / getPartidos();
        return aux;
    }
    /*C- Cualquier empleado debe responder al mensaje calcularSueldoACobrar. El sueldo a
cobrar es el sueldo básico más un 10% del básico por cada año de antigüedad y además:
 Para los jugadores: si el promedio de goles por partido es superior a 0,5 se adiciona un
plus de otro sueldo básico.*/
    @Override
    public double calcularSueldoACobrar(){
        double sueldo;
        sueldo = getSueldo()+getSueldo() * 0.10 * getAntiguedad();
        if (calcularEfectividad() > 0.5){
            sueldo = sueldo+getSueldo();
        }
        return sueldo;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
