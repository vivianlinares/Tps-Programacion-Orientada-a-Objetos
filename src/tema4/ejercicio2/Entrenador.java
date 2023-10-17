/*
 Los entrenadores son empleados que se caracterizan por la cantidad de campeonatos
ganados.
 */
package tema4.ejercicio2;

/**
 *
 */
public class Entrenador extends Empleado {
    private int campeonatosGanados;
    public Entrenador(int campeonatosGanados, int antiguedad, double sueldo, String nombre){
        super(nombre,sueldo,antiguedad);
        this.campeonatosGanados = campeonatosGanados;
    }
    public int getCampeonatosGanados() {
        return campeonatosGanados;
    }

    public void setCampeonatosGanados(int campeonatosGanados) {
        this.campeonatosGanados = campeonatosGanados;
    }
    /*B- Cualquier empleado debe responder al mensaje calcularEfectividad. La efectividad
del entrenador es el promedio de campeonatos ganados por año de antigüedad, mientras
que la del jugador es el promedio de goles por partido.*/
    @Override
    public double calcularEfectividad(){
        double promedio;
        promedio =(double) getCampeonatosGanados()/getAntiguedad();
        return promedio;
    }
     /*C-  Para los entrenadores: se adiciona un plus por campeonatos ganados (5000$ si ha
ganado entre 1 y 4 campeonatos; $30.000 si ha ganado entre 5 y 10 campeonatos;
50.000$ si ha ganado más de 10 campeonatos).*/
    @Override
    public double calcularSueldoACobrar(){
        double aux = getCampeonatosGanados();
        if (1<= getCampeonatosGanados() && getCampeonatosGanados() <= 4){
           aux =  aux + 5000;
        }
        if(5 <=  getCampeonatosGanados() && getCampeonatosGanados() <= 10){
            aux = aux +30000;
        }
        if(10 < getCampeonatosGanados()){
            aux= aux + 50000;
        }
        return aux;
    }
}
