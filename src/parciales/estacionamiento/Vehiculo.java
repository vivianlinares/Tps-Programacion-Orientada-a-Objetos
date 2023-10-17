/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciales.estacionamiento;

public class Vehiculo {
    private String patente;
    private String modelo;
    private String marca;
    private int canthoras;

    public Vehiculo(String patente, String modelo, String marca, int canthoras) {
        this.patente = patente;
        this.modelo = modelo;
        this.marca = marca;
        this.canthoras = canthoras;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCanthoras() {
        return canthoras;
    }

    public void setCanthoras(int canthoras) {
        this.canthoras = canthoras;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", modelo=" + modelo + ", marca=" + marca + ", canthoras=" + canthoras + '}'+"\n";
    }
    
}
