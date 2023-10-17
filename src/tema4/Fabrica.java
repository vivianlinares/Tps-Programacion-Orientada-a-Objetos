/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**

 */
public class Fabrica {
    private String nombre;
    private String localidad;
    public Fabrica(String nombre, String localidad){
        this.localidad = localidad;
        this.nombre = nombre;
    }
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString(){
        return "nombre: "+getNombre()+", localidad: "+ getLocalidad();
    }
}
