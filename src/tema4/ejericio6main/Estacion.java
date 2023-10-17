/*
 El Servicio Meteorológico Nacional necesita un sistema que permita registrar, para una
determinada estación meteorológica, la temperatura promedio mensual de N años
consecutivos a partir de un año A dado.
 */
package tema4.ejericio6main;

public class Estacion {
    private String nombre;
    private String latitud;
    private String longitud;
   public Estacion(String nombre, String latitud, String longitud){
       this.nombre = nombre;
       this.longitud =longitud;
       this.latitud = latitud;
   }
    @Override
  public String toString(){
       return nombre + ", "+" ("+latitud+","+longitud+");";
   }
}
