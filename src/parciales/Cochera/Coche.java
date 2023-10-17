/*
 De los coches
se registra patente y cantidad de horas que estará en el estacionamiento.
 */
package parciales.Cochera;

/**
 *
 */
public class Coche {
    private String patente;
    private int cantHoras;

    public Coche(String patente, int cantHoras) {
        this.patente = patente;
        this.cantHoras = cantHoras;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }
    
}
