/*
4- Una escuela de música arma coros para participar de ciertos eventos. Los coros poseen
un nombre y están formados por un director y una serie de coristas.
Del director se
conoce el nombre, DNI, edad y la antigüedad (un número entero). De los coristas se conoce
el nombre, DNI, edad y el tono fundamental (un número entero). Asimismo, hay dos tipos
de coros: coro semicircular en el que los coristas se colocan en el escenario uno al lado
del otro y coro por hileras donde los coristas se organizan en filas de igual dimensión.
 */
package PracticaDeRepaso.ejercicio4;

/**
 *
 */
public abstract class Coro {
    private String nombre;
    private Director director;
    private Corista corista;
    private int dmf;
    /*a. Implemente las clases necesarias
    teniendo en cuenta que los coros 
    deberían crearse
con un director y sin ningún corista,
    pero sí sabiendo las dimensiones del coro.*/
public Coro(Director director){
    this.director = director;
}

    public int getDmf() {
        return dmf;
    }

    public void setDmf(int dmf) {
        this.dmf = dmf;
    }

    /* agregar un corista al coro. */
    public abstract void agregarCorista(Corista corista);
    
    /*determinar si un coro está lleno o no. Devuelve true si el coro tiene a todos sus
coristas asignados o false en caso contrario*/
    public abstract boolean estaLleno();
}
