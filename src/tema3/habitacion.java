/*
 4-A- Un hotel posee N habitaciones. De cada habitación conoce costo por noche, si está
ocupada y, en caso de estarlo, guarda el cliente que la reservó (nombre, DNI y edad).
 */
package tema3;

import PaqueteLectura.GeneradorAleatorio;
import tema2.Persona;

/**
 *
 * 
 */
public class habitacion {
    private double costo;
    private boolean ocupado;
    private Persona persona;
    //inicializar
    public habitacion(){
        GeneradorAleatorio.iniciar();
        this.ocupado = false;
        this.costo = GeneradorAleatorio.generarDouble(6000)+2000;
    }

    public habitacion(double costo, Persona persona){
        this.costo = costo;
        this.ocupado = true;
        this.persona = persona;
    }
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }  
    @Override
    public String toString(){
        return " persona: "+persona+", ocupado: "+ocupado+", costo: "+costo;
    }
}
