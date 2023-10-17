/*
Una gira es un recital que además tiene un nombre y las “fechas” donde se repetirá la
actuación. De cada “fecha” se conoce la ciudad y el día. Además la gira guarda el
número de la fecha en la que se tocará próximamente (actual).
 */
package PracticaDeRepaso.ejercicio3;

/**
 *
 */
public class Fecha {
    private String ciudad;
    private int dia;
    public Fecha(String ciud, int dia){
       this.ciudad = ciud;
       this.dia = dia;
    }
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
}
