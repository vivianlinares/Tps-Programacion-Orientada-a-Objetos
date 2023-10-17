/*
Los jugadores son empleados que se caracterizan por el número de partidos jugados y
el número de goles anotados.
 */
package tema4.ejercicio2;

/**
 *
 * @author cosito
 */
public class Jugador extends Empleado{
    
    private int partidos;
    private int gol;
    private int goles[];
    private int dml = 0;
    public Jugador(int partidos, int gol){
        this.partidos = partidos;
        this.gol = gol;
        goles = new int[partidos];
    }
     /*B- Cualquier empleado debe responder al mensaje calcularEfectividad. La efectividad
del entrenador es el promedio de campeonatos ganados por año de antigüedad, mientras
que la del jugador es el promedio de goles por partido.*/

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }
    public cargarGoles(int cantGoles){
        goles[dml] = 
    }
    
    @Override
    public double calcularEfectividad(){
        double sumagoles = 0;
        for (int i = 0; i < getPartidos(); i++) {
            sumagoles = sumagoles + goles[i];  
        }
        return(double) sumagoles / getPartidos();
    }
     /*C- Cualquier empleado debe responder al mensaje calcularSueldoACobrar. El sueldo a
cobrar es el sueldo básico más un 10% del básico por cada año de antigüedad y además:
 Para los jugadores: si el promedio de goles por partido es superior a 0,5 se adiciona un
plus de otro sueldo básico.*/
    @Override
    public double calcularSueldoACobrar(){
       if (calcularEfectividad() > 0.5){
           return super.calcularSueldoACobrar() * getSueldoBasico();
       }
       else{
           return super.calcularSueldoACobrar();
       }
    }
}
