/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaDeRepaso.ejercicio2;

/**
 *
 * 
 */
public class Auto {
    String duenio;
    String patente;
    public Auto(){
        
    }
    public Auto(String d, String p){
        this.duenio = d;
        this.patente= p;
    }
    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    @Override
    public String toString(){
        return " duenio: "+ getDuenio()+" patente: "+getPatente();
    }
}
