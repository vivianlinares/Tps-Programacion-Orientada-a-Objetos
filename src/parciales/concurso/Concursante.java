/*
 1. Representar un concurso de baile. El concurso tiene a lo sumo N parejas. Cada pareja
tiene 2 participantes y un estilo de baile. De los participantes se tiene dni, nombre,
edad.
a) Genere las clases necesarias. Provea constructores para iniciar: el concurso para
un máximo de N parejas (inicialmente sin parejas cargadas); las parejas y los
participantes a partir de toda su información.
 b) Implemente métodos en las clases adecuadas para permitir:
 b1) Agregar una pareja al concurso. Asuma que hay lugar.
 b2) Obtener la diferencia de edad de la pareja.
 b3) Obtener la pareja con más diferencia de edad del concurso.
2. Realice un programa que instancie un concurso, cargue 2 parejas y a partir del
concurso muestre: los nombres de los participantes de la pareja con más diferencia de
edad.
 */
package parciales.concurso;

/**
 *
 * @author cosito
 */
public class Concursante {
    private String nombre;
    private int dni;
    private int edad;

    public Concursante(String nombre, int dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString(){
        return " nombre: "+ getNombre();
    }
}
