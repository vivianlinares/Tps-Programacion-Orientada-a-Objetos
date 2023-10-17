/*
 Los entrenadores son empleados que se caracterizan por la cantidad de campeonatos
ganados.
 */
package tema4;

/**
 *
 */
public class Entrenador extends Empleado {
    private int campeonatos;
    public Entrenador(String nombre, double sueldo,int antiguedad,int campeonatos){
        super(nombre,sueldo,antiguedad);
        this.campeonatos = campeonatos;
    }
    public int getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }
    /*Cualquier empleado debe responder al mensaje calcularEfectividad. La efectividad
del entrenador es el promedio de campeonatos ganados por año de antigüedad,*/
    @Override
    public double calcularEfectividad(){
        return(double) campeonatos / getAntiguedad();
    }
    /*C- Cualquier empleado debe responder al mensaje calcularSueldoACobrar. El sueldo a
cobrar es el sueldo básico más un 10% del básico por cada año de antigüedad y además:
 Para los jugadores: si el promedio de goles por partido es superior a 0,5 se adiciona un
plus de otro sueldo básico.
     Para los entrenadores: se adiciona un plus por campeonatos ganados (5000$ si ha
ganado entre 1 y 4 campeonatos; $30.000 si ha ganado entre 5 y 10 campeonatos;
50.000$ si ha ganado más de 10 campeonatos).
    */
    @Override
    public double calcularSueldoACobrar(){
        double sueldo = getSueldo()+getSueldo() * 0.10 * getAntiguedad();
        if(( 1 <= campeonatos)&&(campeonatos <= 4)){
            sueldo  = sueldo + 5000;
        }
        if((5 <= campeonatos)&& (campeonatos <= 10)){
            sueldo= sueldo + 30000;
        }   
        if(campeonatos > 10){
            sueldo = sueldo +50000;
        }
        return sueldo;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
